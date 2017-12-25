package com.yue.springboot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 属性配置文件Demo
 * <pre>
 * 	1、 自定义属性
 *  2、随机数
 *  3、properties -> List, Map
 *  4、多环境配置
 * </pre>
 * 
 * @author zhangyue
 * @since 2017-12-22 16:50:31
 */
@SpringBootApplication
public class ConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}
	
}
