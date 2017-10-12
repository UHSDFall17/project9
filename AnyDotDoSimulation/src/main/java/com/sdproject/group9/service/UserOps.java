package com.sdproject.group9.service;

import com.sdproject.group9.dao.UserDao;
import com.sdproject.group9.model.User;

public class UserOps {
	private User user;
	private UserDao userDao;

	public UserOps() {
		userDao = new UserDao();
	}

	public void registerUser(String userName, String login, String password) {
		if (userName == null || login == null || password == null) {
			System.out.println("Please enter valid values for all the fields");
			return;
		}
		user = new User();
		user.setLoginName(login);
		user.setPassword(password);
		user.setUserName(userName);
		userDao.saveUserInformation(user);
	}

	public void userLogin(String login, String password) {
		if (login == null || password == null) {
			System.out.println("Please Enter valid credentials");
		} else {
			if (userDao.validateUser(login, password)) {
				/* TODO: Display options */
			}
		}
	}
}
