package com.yue.springboot.jdbc.demo.service;

import java.util.List;
import java.util.Map;

/**
 * @Description: 操作user表Service接口
 * 
 * @author zhangyue
 * @since 2018-01-02 10:55:25
 */
public interface UserService {
	
	/**
	 * 根据Id查询用户
	 * 
	 * @param id
	 * @return
	 */
	List<Map<String, Object>> getUserById(Long id);

	/**
	 * 新增用户
	 * 
	 * @param id
	 * @param name
	 * @param password
	 */
	void create(Long id, String name, String password);
	
	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	void delete(Long id);
	
	/**
	 * 查询所用的用户
	 * 
	 * @return
	 */
	Integer getAllUsers();
	
	/**
	 * 删除所有用户
	 */
	void deleteAllUsers();
}
