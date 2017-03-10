package com.kripesh.service;

import java.util.List;

import com.kripesh.model.User;

public interface UserService {

	List<User> findAll();

	User findByUserName(String userName);

	User findByUserId(Long userId);

	User save(User user);
}
