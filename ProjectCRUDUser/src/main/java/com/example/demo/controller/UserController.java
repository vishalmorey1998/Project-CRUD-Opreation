package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired private UserService userService;
	private static final Logger Log=LoggerFactory.getLogger(UserController.class);
      
	
	@PostMapping("/postUserData")
	public ResponseEntity<User> postUserData(@RequestBody User u)
	{    
		User us = userService.postData(u);
		return new ResponseEntity<User>(us,HttpStatus.CREATED);
	}
}
