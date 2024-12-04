package com.example.demo.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.UserController;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService
{ 
	private static final Logger Log=LoggerFactory.getLogger(UserServiceImpl.class);
   @Autowired private UserRepository userRepository;
	@Override
	public User postData(User u) {
		// TODO Auto-generated method stub
		return null;
	}

}
