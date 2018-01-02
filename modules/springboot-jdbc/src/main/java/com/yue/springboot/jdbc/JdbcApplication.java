package com.yue.springboot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 连接数据库DataSource
 * <pre>
 * 	1、配置数据源
 *  2、多环境配置(profile)
 *  3、flyway(数据库脚本管理)
 * </pre>
 *
 * @author zhangyue
 * @since 2017-12-22 14:52:53
 */
@SpringBootApplication
public class JdbcApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}
	
}
