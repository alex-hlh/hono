package com.hu.hono.config;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import java.io.IOException;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.ClusterServersConfig;
import org.redisson.config.Config;
import org.redisson.config.MasterSlaveServersConfig;
import org.redisson.config.SentinelServersConfig;
import org.redisson.config.SingleServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author <wangjian>
 * @version v1.0
 * @title RedisConfig
 * @projectName integration
 * @description
 * @date 2021/9/15 17:37
 */
@Configuration
@SuppressWarnings({"unchecked"})
public class Redisconfig {

	private static final Logger log = LoggerFactory.getLogger(Redisconfig.class);
	private static final String ADDRESS_PREFIX = "redis://";
	@Autowired
	private HonoConfig honoConfig;

	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		// 使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值
		Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		mapper.activateDefaultTyping(LaissezFaireSubTypeValidator.instance, ObjectMapper.DefaultTyping.NON_FINAL,
			JsonTypeInfo.As.WRAPPER_ARRAY);
		serializer.setObjectMapper(mapper);
		template.setValueSerializer(serializer);
		// 使用StringRedisSerializer来序列化和反序列化redis的key值
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new StringRedisSerializer());
		template.setHashValueSerializer(serializer);
		template.afterPropertiesSet();
		log.info("redis持久化");
		return template;
	}

	/**
	 * RedissonClient,单机模式
	 * @return
	 * @throws IOException
	 */
	@Bean
	public RedissonClient redisson() throws IOException {
		// 单机模式
		if (honoConfig.getSentinelMode().equals("single")) {
			log.info("RedissonClient--->初始化成功，模式：单机模式");
			return redissonSingle();
		}
		// 集群模式
		if (honoConfig.getSentinelMode().equals("cluster")) {
			log.info("RedissonClient--->初始化成功，模式：集群模式");
			return redissonCluster();
		}
		// 哨兵模式
		if (honoConfig.getSentinelMode().equals("sentinel")) {
			log.info("RedissonClient--->初始化成功，模式：哨兵模式");
			return redissonSentinel();
		}
		// 主从模式
		if (honoConfig.getSentinelMode().equals("master-slave")) {
			log.info("RedissonClient--->初始化成功，模式：哨兵模式");
			return redissonMasterSlave();
		}
		log.info("RedissonClient--->初始化默认单机模式");
		return redissonSingle();
	}


	/**
	 * 单机模式
	 */
	private RedissonClient redissonSingle() {
		Config config = new Config();
		Codec codec = new JsonJacksonCodec();
		config.setCodec(codec);
		SingleServerConfig serverConfig = config.useSingleServer();
		serverConfig.setTimeout(NumberUtil.parseInt(honoConfig.getTimeout()));
		if (StrUtil.isNotBlank(honoConfig.getRedisPassword())) {
			serverConfig.setAddress(ADDRESS_PREFIX + honoConfig.getHost() + ":" + honoConfig.getPort()).setPassword(honoConfig.getRedisPassword()).setDatabase(Integer.parseInt(
				honoConfig.getDatabase()));
		} else {
			serverConfig.setAddress(ADDRESS_PREFIX + honoConfig.getHost() + ":" + honoConfig.getPort()).setDatabase(Integer.parseInt(
				honoConfig.getDatabase()));
		}
		return Redisson.create(config);
	}


	/**
	 * 哨兵模式
	 */
	private RedissonClient redissonSentinel() {
		Config config = new Config();
		Codec codec = new JsonJacksonCodec();
		config.setCodec(codec);
		// 声明一个配置类
		SentinelServersConfig sentinelServersConfig = config.useSentinelServers();
		// 扫描间隔
		sentinelServersConfig.setScanInterval(2000);
		sentinelServersConfig.setTimeout(NumberUtil.parseInt(honoConfig.getTimeout()));
		sentinelServersConfig.setDatabase(Integer.parseInt(honoConfig.getDatabase()));
		// 判断密码
		if (StrUtil.isNotBlank(honoConfig.getRedisPassword())) {
			sentinelServersConfig.setPassword(honoConfig.getRedisPassword());
		}
		sentinelServersConfig.setMasterName(honoConfig.getMasterName());
		String[] nodeArr = StrUtil.splitToArray(honoConfig.getAddress(), ",");
		for (int i = 0; i < nodeArr.length; i++) {
			if (!nodeArr[i].startsWith(ADDRESS_PREFIX)) {
				nodeArr[i] = ADDRESS_PREFIX + nodeArr[i];
			}
		}
		// 添加redis节点
		sentinelServersConfig.addSentinelAddress(nodeArr);
		return Redisson.create(config);
	}

	/**
	 * 集群模式
	 */
	private RedissonClient redissonCluster() {
		// 声明一个配置类
		Config config = new Config();
		Codec codec = new JsonJacksonCodec();
		config.setCodec(codec);
		ClusterServersConfig clusterServersConfig = config.useClusterServers();
		// 扫描间隔
		clusterServersConfig.setScanInterval(2000);
		clusterServersConfig.setTimeout(NumberUtil.parseInt(honoConfig.getTimeout()));
		// 判断密码
		if (StrUtil.isNotBlank(honoConfig.getRedisPassword())) {
			clusterServersConfig.setPassword(honoConfig.getRedisPassword());
		}
		// 添加redis节点
		String[] nodeArr = StrUtil.splitToArray(honoConfig.getRedisPassword(), ",");
		for (int i = 0; i < nodeArr.length; i++) {
			if (!nodeArr[i].startsWith(ADDRESS_PREFIX)) {
				nodeArr[i] = ADDRESS_PREFIX + nodeArr[i];
			}
		}
		clusterServersConfig.addNodeAddress(nodeArr);
		return Redisson.create(config);
	}

	/**
	 * 主从模式
	 */
	private RedissonClient redissonMasterSlave() {
		Config config = new Config();
		Codec codec = new JsonJacksonCodec();
		config.setCodec(codec);
		MasterSlaveServersConfig masterSlaveServers = new Config().useMasterSlaveServers();
		// 超时
		masterSlaveServers.setTimeout(NumberUtil.parseInt(honoConfig.getTimeout()));
		masterSlaveServers.setDatabase(Integer.parseInt(honoConfig.getDatabase()));
		// 判断密码
		if (StrUtil.isNotBlank(honoConfig.getRedisPassword())) {
			masterSlaveServers.setPassword(honoConfig.getRedisPassword());
		}
		// 添加redis节点
		String[] nodeArr = StrUtil.splitToArray(honoConfig.getAddress(), ",");
		if (ArrayUtil.isEmpty(nodeArr)) {
			throw new RuntimeException("RedissonClient--->初始化主从模式失败，没有配置节点地址");
		}
		masterSlaveServers.setMasterAddress(nodeArr[0]);
		for (int i = 1; i < nodeArr.length; i++) {
			if (!nodeArr[i].startsWith(ADDRESS_PREFIX)) {
				nodeArr[i] = ADDRESS_PREFIX + nodeArr[i];
			}
			masterSlaveServers.addSlaveAddress(nodeArr[i]);
		}
		return Redisson.create(config);
	}
}
