package com.memories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memories.entity.User;
import com.memories.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user) {
		
		userService.addUser(user);
		
		return "result";
	}
	
	/**
	 * 查询用户的信息，输出为json
	 * /userView/{userId}里面的{userId}表示将这个位置的参数传到@pathVariable指定的名称中
	 * @return 
	 */
	@RequestMapping("/userView/{userId}")
	public @ResponseBody User userView(@PathVariable("userId") Long userId,Model model) {
		
		//调用service完成用户的查询
		User user = userService.getUserById(userId);
		
//		model.addAttribute("username",user.getUsername());
//		model.addAttribute("password",user.getPassword());
		
		return user;
	}
	
	@RequestMapping("/getUserByName")
	public String getUserByName(Model model) {
		List<User> userList = userService.getUserByName("zz");
		
		model.addAttribute("userList",userList);
		
		return "result";
	}
	
	@RequestMapping("/login")
	public String login() {
		//TODO 登录认证
		return "success";
	}
	
	@RequestMapping("/tologin")
	public String tologin() {
		//跳转到登录页面
		return "login";
	}
}
