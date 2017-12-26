package com.yue.springboot.web.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 用户实体
 * 
 * @author zhangyue
 * @since 2017-12-25 15:44:15
 */
public class User implements Serializable {

	private static final long serialVersionUID = 4222651861327183668L;
	
	private Long id;
	
	private String name;
	
	private String password;
	
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
