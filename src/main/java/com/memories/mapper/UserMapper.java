package com.memories.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.memories.entity.User;

@Mapper
public interface UserMapper {

	void addUser(User user);

	User getUserById(Long userId);

	List<User> getUserByName(String username);

}
