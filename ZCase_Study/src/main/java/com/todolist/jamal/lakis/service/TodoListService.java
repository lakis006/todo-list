package com.todolist.jamal.lakis.service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.repository.TodoListRepository;

@Service
public class TodoListService {
	@Autowired
	TodoListRepository repo;
	

	
	public TodoList getTodoList(int id) {
		Integer user = new User().getUserId();
		TodoList list = new TodoList();
			if(list.getUser().getUserId().equals(user)) {
				return this.getTodoList(id);
			}
		return null;
	}
	

	
	
	public void addTodoList( int userId) {
		repo.save(new TodoList(userId));
	}
	
}
