package com.kripesh.controller;

import static com.kripesh.controller.util.ApiConstants.API_VER;
import static com.kripesh.controller.util.ApiConstants.USER_PATH;
import static com.kripesh.controller.util.ApiConstants.USER_REGISTER_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kripesh.model.User;
import com.kripesh.service.UserService;

@RestController
@RequestMapping(API_VER + USER_PATH)
public class UserController {

	@Autowired
	private UserService userService;

	/*public String login() {
		return "";
	}*/

	@RequestMapping(value = USER_REGISTER_PATH, method = RequestMethod.POST)
	public User registerUser(@RequestBody User user) {
		return userService.save(user);
	}
}
