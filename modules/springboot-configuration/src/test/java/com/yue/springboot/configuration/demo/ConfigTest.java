package com.yue.springboot.configuration.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: Config测试
 * 
 * @author zhangyue
 * @since 2017-12-23 15:59:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

	@Autowired
	private Config config;

	@Test
	public void test() {
		assertNotNull(config.getServers());
		assertEquals(2, config.getServers().size());
		assertEquals("dev.yue.com", config.getServers().get(0));
		assertNotNull(config.getStudents());
		assertTrue(config.getStudents().containsKey("zhangsan"));
		assertEquals("123", config.getStudents().get("zhangsan"));
	}

}
