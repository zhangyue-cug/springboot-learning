package com.yue.springboot.configuration.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Description: User测试
 * 
 * @author zhangyue
 * @since 2017-12-23 10:39:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {
	
	@Autowired
	private Person person;
	
	@Test
	public void test() {
		assertEquals("zhangsan", person.getName());
		assertEquals(21, person.getAge());
	}
}
