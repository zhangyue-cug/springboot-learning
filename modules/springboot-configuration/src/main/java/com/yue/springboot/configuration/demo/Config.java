package com.yue.springboot.configuration.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: ConfigurationProperties使用
 * 
 * @author zhangyue
 * @since 2017-12-23 15:54:16
 */
@ConfigurationProperties(prefix = "com.yue.springboot.configuration")
@Component
public class Config {
	
	private List<String> servers = new ArrayList<>();
	
	private Map<String, String> students = new HashMap<>(); 

	public List<String> getServers() {
		return servers;
	}

	public Map<String, String> getStudents() {
		return students;
	}
	
}
