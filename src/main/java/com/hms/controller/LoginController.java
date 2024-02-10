package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Login;
import com.hms.bean.User;
import com.hms.service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping("/Login")
	public ResponseEntity<Login> performLogin(@RequestBody User user) {
		Login result = service.login(user);
		return ResponseEntity.ok(result);
	}

}
