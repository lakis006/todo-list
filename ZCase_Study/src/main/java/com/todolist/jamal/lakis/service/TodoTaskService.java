package com.todolist.jamal.lakis.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.repository.TodoTaskRepository;

@Service
public class TodoTaskService {
	
	private TodoTaskRepository repo;
	@Autowired
	public TodoTaskService(TodoTaskRepository repo) {
		super();
		this.repo = repo;
	}
	
	private static List<TodoTask> todos = new ArrayList<TodoTask>();
	private static int todoCount = 0;
	
	public List<TodoTask> getTodos(String user) {
		List<TodoTask> filteredTodos = new ArrayList<TodoTask>();
		Iterable<TodoTask> aList = repo.findAll();
		for(TodoTask todo: aList) {
			System.out.println("inside getTodos within for-loop " + aList);
			if(todo.getUserName().equals(user))
				System.out.println("inside getTodos within if statement " + user);
				filteredTodos.add(todo); 
				System.out.println("inside getTodos within todo " + todo);
		}
		return filteredTodos;
	}
	
//	@Transactional
//	public void updateTodo(TodoTask todo) {
//		repo.delete(todo);
//		repo.save
//		
//	}
	
	public void addTodo( String userName, TodoList tList, String tName,  String tDesc, String doneDate, boolean isDone) {
		repo.save(new TodoTask(null, tList,userName, tName, tDesc, doneDate, isDone));
	}
	
	public TodoTask findbyId(Integer id) {
		return repo.findById(id).get();
		
	}
 	
	public void deleteById(Integer id) {
			repo.deleteById(id);
		}
	
}
