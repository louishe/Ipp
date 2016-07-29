package com.missionsky.ipp.service.user;

import java.util.List;

import com.missionsky.ipp.entity.User;

/**
 * User service to define the expected user operation.
 * @author louis.he
 *
 */
public interface IUserService {
	
	/**
	 * Return all users.
	 * @return List<User>
	 */
	List<User> getAll();
	
	/**
	 * Return User by userId
	 * @param id
	 * @return
	 */
	User getUserByUserId(String id);
	
	/**
	 * Add user 
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * Edit user
	 * @param user
	 * @return
	 */
	int editUser(User user);

}
