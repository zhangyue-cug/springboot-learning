package com.yue.springboot.jpa.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import com.yue.springboot.jpa.demo.domain.User;
import com.yue.springboot.jpa.demo.domain.UserRepository;

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
	
	private static final String TEST_NAME = "zhangsan";
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testListUser() {
		List<User> users = userService.listUser();
		assertNotNull(users);
		assertEquals(2, users.size());
	}
	
	@Test
	public void testQueryUser() {
		List<User> user = userService.queryUser(TEST_NAME);
		assertNotNull(user);
	}
	
	@Test
	public void testListUserPage() {
		Page<User> userPage = userService.listUserPage(1);
		assertNotNull(userPage);
	}
	
	@Test
	public void testAddUser() {
		User user = new User();
		// user.setId(3L);
		user.setName("xiaoming");
		user.setPassword("123456");
		User u = userRepository.save(user);
		assertNotNull(u.getId());
		assertEquals("xiaoming", user.getName());
	}
	
	@Test
	public void testDeleteById() {
		userRepository.delete(TEST_ID);
		User user = userRepository.findOne(TEST_ID);
		assertTrue(user == null);
	}
	
	@Test
	public void testDeleteAllUser() {
		userRepository.deleteAll();
		List<User> users = userService.listUser();
		assertTrue(users.size() == 0);
	}

}
