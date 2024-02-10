package com.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Login;
import com.hms.bean.User;
import com.hms.dao.UserRepo;

@Service
public class LoginService {

	@Autowired
	UserRepo repo;
	User user;

	public Login login(User user) {

		User use = repo.findByUserEmail(user.getUserEmail());
		User password = repo.findByUserPassword(user.getUserPassword());

		if (use != null && password != null) {
			String name = use.getUserPassword();
			String pass = password.getUserPassword();

			if (name.equals(pass)) {
				String result = use.getUserType();

				if (result.equalsIgnoreCase("admin")) {
					return new Login("Admin Success");
				} else if (result.equalsIgnoreCase("Doctor")) {
					return new Login("Doctor Success");
				} else if (result.equals("Patient")) {
					return new Login("Patient Success");
				}
				else {
					return new Login("failed");
				}
			} else {
				return new Login("Login Fail");
			}
		} else {
			return new Login("Login Fail");
		}

	}
}
