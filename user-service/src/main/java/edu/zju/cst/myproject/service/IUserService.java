package edu.zju.cst.myproject.service;

import edu.zju.cst.myproject.model.User;

public interface IUserService {
	
	public void add(User user);
	public User getUserByName(String userName);
}
