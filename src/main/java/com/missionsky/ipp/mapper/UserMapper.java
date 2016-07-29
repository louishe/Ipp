package com.missionsky.ipp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.missionsky.ipp.entity.User;

@Repository
public interface UserMapper {
	
	User getUserByUserId(String id);
	
	List<User> getAll();
	
	int addUser(User user);
	
	int editUser(User user);

}
