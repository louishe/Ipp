package com.missionsky.ipp.controller.user;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.missionsky.ipp.entity.User;
import com.missionsky.ipp.service.user.IUserService;

/**
 * User controller: register user, edit user, etc.
 * @author louis.he
 *
 */
@Controller
@RequestMapping("userController")
public class UserController {

	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/addUser")
	public String registerUser(User user)
	{
		String userId = UUID.randomUUID().toString();
		user.setId(userId);
		userService.addUser(user);
		return "redirect:/";
	}
	
}
