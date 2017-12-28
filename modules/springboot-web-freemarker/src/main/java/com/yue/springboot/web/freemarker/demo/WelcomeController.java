package com.yue.springboot.web.freemarker.demo;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: WelcomeController
 *
 * @author zhangyue
 * @since 2017-12-21 16:36:19
 */
@Controller
public class WelcomeController {
	
	@Value("${message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}
	
}
