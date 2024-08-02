package com.hu.hono.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author hlh
 * @version 1.0
 * @project hono
 * @description
 * @date 2024/7/31 22:42:07
 */
@Configuration
@Data
public class HonoConfig {
	/**
	 * 链接URL
	 */
	@Value("${spring.datasource.url}")
	private String url;
	/**
	 * 账户
	 */
	@Value("${spring.datasource.username}")
	private String username;
	/**
	 * 密码
	 */
	@Value("${spring.datasource.password}")
	private String dbPassword;
	/**
	 * 驱动名称
	 */
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	/**
	 * 驱动类型
	 */
	@Value("${spring.datasource.type}")
	private String type;

	/**
	 * 连接池中允许的最小连接数
	 */
	@Value("${spring.datasource.hikari.minimum-idle:#{10}}")
	private String minimumIdle;
	/**
	 * 最大连接数
	 */
	@Value("${spring.datasource.hikari.maximum-pool-size:#{100}}")
	private String maxPoolSize;
	/**
	 * 空闲连接存活最大时间，默认600000(10分钟)，配置参数默认单位是毫秒
	 */
	@Value("${spring.datasource.hikari.idle-timeout:#{600000}}")
	private String idleTimeout;
	/**
	 * 数据库连接超时时间，默认15秒，最低设置值250毫秒 配置参数默认单位是毫秒
	 */
	@Value("${spring.datasource.hikari.connection-timeout:#{15000}}")
	private String connectionTimeout;
	/**
	 * 数据库连接池名称
	 */
	@Value("${spring.datasource.hikari.pool-name:#{HikariCP}}")
	private String poolName;
	/**
	 * 连接池中连接的最长活跃时间。使用中的连接不会销毁，只有关闭的连接才会被销毁。 默认值是1800000（30分钟）
	 */
	@Value("${spring.datasource.hikari.max-lifetime:#{1800000}}")
	private String maxLifetime;
	/**
	 * 自动提交，默认true
	 */
	@Value("${spring.datasource.hikari.auto-commit:#{true}}")
	private String autoCommit;

	/**
	 * redis和redison配置信息
	 */
	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private String port;
	@Value("${spring.redis.password}")
	private String redisPassword;
	@Value("${spring.redis.database:#{0}}")
	private String database;
	@Value("${spring.redis.timeout:#{20000}}")
	private String timeout;
	@Value("${redisson.sentinelMode:#{single}}")
	private String sentinelMode;
	@Value("${redisson.address:#{null}}")
	private String address;
	@Value("${redisson.masterName:#{myRedisMaster}}")
	private String masterName;

}
