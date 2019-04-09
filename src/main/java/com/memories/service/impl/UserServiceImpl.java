package com.memories.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memories.entity.User;
import com.memories.mapper.UserMapper;
import com.memories.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Long userId) {
		return userMapper.getUserById(userId);
	}	
	
	@Override
	public List<User> getUserByName(String username) {
		return userMapper.getUserByName(username);
	}	
	
	@Override
	public void addUser(User user) {
		//TODO 密码用MD5进行加密
		//调用mapper保存到数据库中
		userMapper.addUser(user);
	}



}
