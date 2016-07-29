package ipp.user;

import java.util.UUID;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.missionsky.ipp.entity.User;
import com.missionsky.ipp.kit.LogKit;
import com.missionsky.ipp.service.user.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class UserTest {

	@Resource
	private IUserService userService;

	@Test
	public void testGetUserByUserId() {
		 userService.getUserByUserId("111");
	}

	@Test
	public void adddUser() {
		String userId = UUID.randomUUID().toString();
		User user = new User(userId, "tester1", 10, "password");
		int i = userService.addUser(user);
		LogKit.error("add user " + i);
	}
	
	

}
