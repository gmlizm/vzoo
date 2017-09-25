package com.aboo.vzoo.authcenter.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据库连接配置类
 * 
 * @author lizm
 *
 */
@Configuration
public class DatabaseConfig {
	
	/** 日志记录工具 */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*########数据源配置-start########*/
	@Primary
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public DataSource dataSource() {
		DataSource dataSource = DataSourceBuilder.create().build();
		logger.info("系统应用的MySQL数据库-数据源为【{}】", dataSource.getClass().getSimpleName());
		return dataSource;
	}
	
	/*########数据源配置-end########*/
	

}
