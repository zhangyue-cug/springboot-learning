package com.yue.springboot.web.demo.controller;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Description: 用户DTO
 * 
 * @author zhangyue
 * @since 2017-12-25 16:16:01
 */
public class UserDTO {

	private Long id;
	
	private String name;
	
	private String password;
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
