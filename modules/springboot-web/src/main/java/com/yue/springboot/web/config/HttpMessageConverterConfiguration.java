package com.yue.springboot.web.config;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @Description: 自定义HttpMessageConverter
 * 
 * @author zhangyue
 * @since 2017-12-25 14:51:46
 */
@Configuration
public class HttpMessageConverterConfiguration {

	@Bean
	public HttpMessageConverters customConverters() {
		HttpMessageConverter<?> additional =  new FastJsonHttpMessageConverter();
	    return new HttpMessageConverters(additional);
	}
	
}
