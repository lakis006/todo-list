package com.todolist.jamal.lakis.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.repository.TodoTaskRepository;

@Service
public class TodoTaskService {
	@Autowired
	TodoTaskRepository repo;
	
	private static List<TodoTask> todos = new ArrayList<TodoTask>();
	private static int todoCount = 0;
	
	public List<TodoTask> getTodos(String user) {
		List<TodoTask> filteredTodos = new ArrayList<TodoTask>();
		Iterable<TodoTask> aList = repo.findAll();
		for(TodoTask todo: aList) {
			if(todo.getUserName().equals(user))
				filteredTodos.add(todo); 
		}
		return filteredTodos;
	}
	
	public void updateTodo(TodoTask todo) {
		todos.remove(todo);
		todos.add(todo);
	}
	
	public void addTodo( String userName, String tName,  String tDesc, Date doneDate, boolean isDone) {
		repo.save(new TodoTask(null, userName, tName, tDesc, doneDate, isDone));
	}
	
	public void deleteTodo(int id) {
		Iterator<TodoTask> iterator = ((List<TodoTask>) repo).iterator();
		
		while(iterator.hasNext()) {
			TodoTask todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}
