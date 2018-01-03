package com.yue.springboot.multi.datasource.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description: 用户实体（主键生成策略需要学习）
 * 
 * @author zhangyue
 * @since 2018-01-02 10:37:59
 */
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -3828292910702939866L;
	
	@Id
	private Long id;
	
	private String name;
	
	private String password;

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

}
