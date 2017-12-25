package com.yue.springboot.quickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: 测试环境构建
 *
 * @author zhangyue
 * @since 2017-12-22 9:49:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickstartApplicationTest {
	
	/** 日志 */
    protected static Logger LOGGER = LoggerFactory.getLogger(QuickstartApplicationTest.class);
    
    @Test
    public void test() {
    	LOGGER.info("=========测试环境构建完毕========");
    }
    
}
