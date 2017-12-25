package com.yue.springboot.quickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Hello Controller
 *
 * @author zhangyue
 * @since 2017-12-21 16:36:19
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "hello world!";
	}
	
}
