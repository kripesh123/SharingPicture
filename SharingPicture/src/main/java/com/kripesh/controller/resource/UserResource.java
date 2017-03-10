package com.kripesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kripesh.model.User;
import com.kripesh.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserResource {
	@Autowired
	UserService userService;
	
	@RequestMapping("/user/users")
	public List<User> findAllUsers(){
		return userService.findAllUsers();
	}
}
