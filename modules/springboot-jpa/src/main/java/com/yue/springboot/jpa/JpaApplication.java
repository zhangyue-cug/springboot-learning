package com.yue.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 使用jpa方式操作数据库
 * <pre>
 * 	https://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/index.html
 * </pre>
 *
 * @author zhangyue
 * @since 2017-12-22 14:52:53
 */
@SpringBootApplication
public class JpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	
}
