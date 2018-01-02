package com.yue.springboot.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: 配置文件测试
 * 
 * @author zhangyue
 * @since 2017-12-22 16:53:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationApplicationTest {

	/** 日志 */
	protected static Logger LOGGER = LoggerFactory.getLogger(ConfigurationApplicationTest.class);

	@Test
	public void test() {
		LOGGER.info("=========测试环境构建完毕========");
	}
 
}
