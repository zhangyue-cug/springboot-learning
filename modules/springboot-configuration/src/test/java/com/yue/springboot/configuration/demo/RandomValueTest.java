package com.yue.springboot.configuration.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: 随机数测试
 * 
 * @author zhangyue
 * @since 2017-12-23 11:58:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomValueTest {
	
	@Autowired
	private RandomValue randomValue;
	
	@Test
	public void test() {
		assertNotNull(randomValue.getValue());
		assertNotNull(randomValue.getNumber());
		assertTrue(randomValue.getThen() > 0 && randomValue.getThen() < 10);
		assertTrue(randomValue.getRange() > 10 && randomValue.getRange() < 20);
	}
	
}
