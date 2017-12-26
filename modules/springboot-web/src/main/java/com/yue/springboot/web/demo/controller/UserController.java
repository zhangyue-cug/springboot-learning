package com.yue.springboot.web.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: User控制器
 * 
 * @author zhangyue
 * @since 2017-12-25 15:27:25
 */
@RestController
public class UserController {
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public UserDTO getUser() {
		UserDTO user = new UserDTO();
		user.setId(1L);
		user.setName("xiaozhang");
		user.setPassword("123456");
		user.setCreateTime(new Date());
		return user;
	}
}
