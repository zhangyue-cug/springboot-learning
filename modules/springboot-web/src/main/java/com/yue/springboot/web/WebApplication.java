package com.yue.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: springboot web项目
 * <pre>
 * 	1、自定义 HttpMessageConverter
 * </pre>
 * 
 * @author zhangyue
 * @since 2017-12-25 09:34:53
 */
@SpringBootApplication
public class WebApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	
}
