package com.missionsky.ipp.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.missionsky.ipp.entity.User;
import com.missionsky.ipp.mapper.UserMapper;
import com.missionsky.ipp.service.user.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	
	@Resource
	private UserMapper userMapper;

	public List<User> getAll() {
		return null;
	}

	public User getUserByUserId(String userId) {
		return userMapper.getUserByUserId(userId);
	}

	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	public int editUser(User user) {
		return 0;
	}

}
