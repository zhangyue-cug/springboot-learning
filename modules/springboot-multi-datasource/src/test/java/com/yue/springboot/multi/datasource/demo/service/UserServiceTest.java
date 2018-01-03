package com.yue.springboot.multi.datasource.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.yue.springboot.multi.datasource.demo.domain.User;
import com.yue.springboot.multi.datasource.demo.domain.primary.PrimaryUserRepository;
import com.yue.springboot.multi.datasource.demo.domain.secondary.SecondaryUserRepository;

/**
 * @Description: 用户Service测试
 * 
 * @author zhangyue
 * @since 2018-01-02 15:04:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate primaryJdbcTemplate;
	
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	private JdbcTemplate secondaryJdbcTemplate;
	
	@Autowired
	private PrimaryUserRepository primaryRepository;
	
	@Autowired
	private SecondaryUserRepository secondaryRepository;
	
	@Test
	public void testJdbcAddUser() {
		
		String sql = "insert into user (id, name, password) values (?, ?, ?)";
		primaryJdbcTemplate.update(sql, 3, "xiaoming", "123456");
		secondaryJdbcTemplate.update(sql, 3, "xiaoming", "123456");
		
	}
	
	@Test
	public void testJpaAddUser() {
		User user = new User();
		user.setId(2L);
		user.setName("xiaohong");
		user.setPassword("123456");
		User primaryUser = primaryRepository.save(user);
		User secondaryUser = secondaryRepository.save(user);
		
		assertNotNull(primaryUser.getId());
		assertEquals("xiaohong", primaryUser.getName());
		assertNotNull(secondaryUser.getId());
		assertEquals("xiaohong", secondaryUser.getName());
		
	}
}
