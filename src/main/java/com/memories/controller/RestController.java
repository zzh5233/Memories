package com.memories.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memories.entity.User;
import com.memories.service.UserService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/thing")
	public User thing() {
			return new User("zzh3","123456",new Date());
	}
	
	@RequestMapping("/restUserView/{userId}")
	public  User userView(@PathVariable("userId") Long userId) {
		//调用service完成用户的查询
		User user = userService.getUserById(userId);
		
		return user;
	}
}
