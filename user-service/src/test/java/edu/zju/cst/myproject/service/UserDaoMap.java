package edu.zju.cst.myproject.service;

import java.util.HashMap;
import java.util.Map;

import edu.zju.cst.myproject.dao.IUserDao;
import edu.zju.cst.myproject.model.User;

public class UserDaoMap implements IUserDao{

	private Map<String, User> map = new HashMap<String, User>();

	public void add(User user) {
		if (map.containsKey(user.getName())) {
			throw new RuntimeException("Already exist.");
		}

		map.put(user.getName(), user);
	}

	public User getUserByName(String name) {

		return map.get(name);
	}

	public void delete(User user) {
		map.remove(user.getName());
	}

}
