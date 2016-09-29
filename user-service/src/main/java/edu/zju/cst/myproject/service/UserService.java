package edu.zju.cst.myproject.service;

import edu.zju.cst.myproject.dao.IUserDao;
import edu.zju.cst.myproject.model.User;

public class UserService implements IUserService {
	private IUserDao userDao;
	public UserService(IUserDao userDao) {
		super();
		this.userDao=userDao;
		// TODO Auto-generated constructor stub
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(userName);
	}

}
