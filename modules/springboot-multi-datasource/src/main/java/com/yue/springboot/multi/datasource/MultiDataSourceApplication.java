package com.yue.springboot.multi.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 多数据源配置(使用jdbc和jpa两种方式操作)
 * <pre>
 * 	目前只是操作两个数据库，用到时学更加深入的学习，事物怎么控制（JTA），这样配置的原理等
 *  flyway怎么配置两个数据库
 * </pre>
 *
 * @author zhangyue
 * @since 2017-12-22 14:52:53
 */
@SpringBootApplication
public class MultiDataSourceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MultiDataSourceApplication.class, args);
	}
	
}
