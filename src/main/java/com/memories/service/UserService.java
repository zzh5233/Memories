package com.memories.service;

import java.util.List;

import com.memories.entity.User;

public interface UserService {

	void addUser(User user);

	User getUserById(Long userId);

	List<User> getUserByName(String username);

}
