package edu.zju.cst.myproject.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.zju.cst.myproject.dao.IUserDao;
import edu.zju.cst.myproject.model.User;
import edu.zju.cst.myproject.util.EntitiesHelper;


public class UserServiceTest {

	private IUserDao userDao;
	private IUserService userService;
	private User baseUser;

	@Before
	public void setUp() {
		userDao = new UserDaoMap();
		userService = new UserService(userDao);
		baseUser = new User("admin", "Ningbo");
	}

	@Test
	public void testAdd() {
		userService.add(baseUser);
	}

	@Test
	public void testGetUserByName() {
		userDao.add(new User("admin","Ningbo"));

		User tu = userService.getUserByName("admin");
		EntitiesHelper.assertUser(tu, baseUser);
	}

	@After
	public void tearDown() {
	}

}
