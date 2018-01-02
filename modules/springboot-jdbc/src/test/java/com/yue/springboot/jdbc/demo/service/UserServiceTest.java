package com.yue.springboot.jdbc.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: 用户Service测试
 * 
 * @author zhangyue
 * @since 2018-01-02 15:04:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	private static final Long TEST_ID = 2L;
	
	@Autowired
	private UserService userService;

	@Test
	public void testGetUserById() {
		List<Map<String, Object>> user = userService.getUserById(TEST_ID);
		assertNotNull(user);
		assertEquals("lisi", user.get(0).get("name"));
	}
	
	@Test
	public void testCreate() {
		userService.create(3L, "xiaoming", "123456");
		List<Map<String, Object>> user = userService.getUserById(3L);
		assertEquals("xiaoming", user.get(0).get("name"));
	}
	
	@Test
	public void testDelete() {
		userService.delete(TEST_ID);
		List<Map<String, Object>> user = userService.getUserById(TEST_ID);
		assertTrue(user.size() == 0);
	}
	
	@Test
	public void testGetAllUsers() {
		Integer num = userService.getAllUsers();
		assertTrue(num == 2);
	}
	
	@Test
	public void testDeleteAllUsers() {
		userService.deleteAllUsers();
		Integer num = userService.getAllUsers();
		assertTrue(num == 0);
	}
}
