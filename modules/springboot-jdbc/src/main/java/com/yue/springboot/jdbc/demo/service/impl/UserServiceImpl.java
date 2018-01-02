package com.yue.springboot.jdbc.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yue.springboot.jdbc.demo.service.UserService;

/**
 * @Description: 操作user表Service实现
 * 
 * @author zhangyue
 * @since 2018-01-02 10:56:24
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> getUserById(Long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from user where id = ?");
		return jdbcTemplate.queryForList(sql.toString(), id);
	}

	@Override
	public void create(Long id, String name, String password) {
		String sql = "insert into user (id, name, password) values (?, ?, ?)";
		jdbcTemplate.update(sql, id, name, password);
	}

	@Override
	public void delete(Long id) {
		String sql = "delete from user where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Integer getAllUsers() {
		String sql = "select count(1) from user";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public void deleteAllUsers() {
		jdbcTemplate.update("delete from user");
	}

}
