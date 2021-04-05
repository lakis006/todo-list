package com.todolist.jamal.lakis.repository;

import org.springframework.data.repository.CrudRepository;

import com.todolist.jamal.lakis.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findUserByUsername(String username);
}
