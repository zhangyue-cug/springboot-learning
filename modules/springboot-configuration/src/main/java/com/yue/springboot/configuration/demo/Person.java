package com.yue.springboot.configuration.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 用户信息
 * 
 * @author zhangyue
 * @since 2017-12-23 10:26:39
 */
@Component
public class Person {
	
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
