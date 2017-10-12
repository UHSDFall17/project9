package com.sdproject.group9.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sdproject.group9.model.User;

public class UserDao {
	private Map<String, User> users;

	public UserDao() {
		users = new HashMap<String, User>();
	}

	public void saveUserInformation(User user) {
		users.put(user.getLoginName(), user);
	}

	public boolean validateUser(String login, String password) {
		User user = users.get(login);
		boolean isValidUser = false;
		if (user == null) {
			System.out.println("User " + login + " is not registered with us");
		} else {
			if (user.getPassword().equals(password)) {
				System.out.println("Login successful!!");
				isValidUser = true;
			}
		}
		return isValidUser;
	}
}
