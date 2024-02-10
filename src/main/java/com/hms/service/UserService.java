package com.hms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.User;
import com.hms.dao.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	public boolean insertUser(User user) {
		repo.save(user);
		return true;
	}

	public boolean updateUser(User user) {
		repo.save(user);
		return true;
	}

	public boolean deleteUser(long userId) {
		repo.deleteById(userId);
		return true;
	}

	public User showUser(long userId) {
		return repo.findById(userId).get();

	}

	public List<User> showAllUsers() {
		Iterator<User> user = repo.findAll().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}

	public List<User> showAllPatients() {
		Iterator<User> user = repo.viewAllPatients().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}

	public List<User> showAllDoctors() {
		Iterator<User> user = repo.viewAllDoctors().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}
}
