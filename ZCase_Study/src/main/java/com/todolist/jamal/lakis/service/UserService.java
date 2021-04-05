package com.todolist.jamal.lakis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	@Autowired 
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public User findUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}
}
