package com.hu.hono.config;

import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @projectName: lcdp
 * @package: com.yz.flowportal.business.config
 * @className: DataSourceConfig
 * @author: hlh
 * @description: 数据源配置
 * @date: 2024/1/12 16:06
 * @version: 1.0
 */
@Configuration
public class DataSourceConfig {
	@Autowired
	private HonoConfig honoConfig;

	/**
	 * 数据源注入
	 * @return
	 */
	@Bean
	@Primary
	public DataSource getDataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setJdbcUrl(honoConfig.getUrl());
		dataSource.setUsername(honoConfig.getUsername());
		dataSource.setPassword(honoConfig.getDbPassword());
		dataSource.setDriverClassName(honoConfig.getDriverClassName());
		dataSource.setPoolName(honoConfig.getPoolName());
		dataSource.setMinimumIdle(NumberUtil.parseInt(honoConfig.getMinimumIdle()));
		dataSource.setMaximumPoolSize(NumberUtil.parseInt(honoConfig.getMaxPoolSize()));
		dataSource.setIdleTimeout(NumberUtil.parseLong(honoConfig.getIdleTimeout()));
		dataSource.setConnectionTimeout(NumberUtil.parseLong(honoConfig.getConnectionTimeout()));
		dataSource.setMaxLifetime(NumberUtil.parseLong(honoConfig.getMaxLifetime()));
		dataSource.setAutoCommit(BooleanUtil.toBoolean(honoConfig.getAutoCommit()));
		return dataSource;
	}
}
