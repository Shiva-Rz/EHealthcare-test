package com.hms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.User;

import com.hms.service.UserService;


@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("RegisterUser")
	public void registerUser(@RequestBody User user) {
		service.insertUser(user);
		
	}

	@PutMapping("EditUser")
	public void editUser(@RequestBody User user) {
		service.updateUser(user);
		
	}

	@DeleteMapping("RemoveUser/{userId}")
	public void removeUser(@PathVariable("userId") long userId) {
		service.deleteUser(userId);
		
	}

	@GetMapping("ViewUser/{userId}")
	public User viewUser(@PathVariable("userId") long userId) {
		return service.showUser(userId);
	}

	@GetMapping("ViewAllUsers")
	public List<User> viewAllUsers() {
		Iterator<User> user = service.showAllUsers().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}
	
	@GetMapping("ViewAllPatients")
	public List<User> viewAllPatients() {
		Iterator<User> user = service.showAllPatients().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}
	
	@GetMapping("ViewAllDoctors")
	public List<User> viewAllDoctors() {
		Iterator<User> user = service.showAllDoctors().iterator();
		List<User> usersList = new ArrayList<>();

		while (user.hasNext()) {
			usersList.add(user.next());
		}
		return usersList;
	}
	
}
