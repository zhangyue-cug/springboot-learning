package com.yue.springboot.jpa.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.yue.springboot.jpa.demo.domain.User;

/**
 * @Description: 操作user表Service接口
 * 
 * @author zhangyue
 * @since 2018-01-02 10:55:25
 */
public interface UserService {
	
	/**
	 * 演示通过仓储查询
	 * 
	 * @return
	 */
	List<User> listUser();
	
	/**
	 * 演示通过HQL查询
	 * 
	 * @return
	 */
	List<User> queryUser(String name);
	
	/**
     * 分页查询
     * 
     * @return
     */
    Page<User> listUserPage(int page);
    
}
