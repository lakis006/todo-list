package com.todolist.jamal.lakis.service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todolist.jamal.lakis.models.TodoTask;

@Service
public class TodoListService {
	private static List<TodoTask> todos = new ArrayList<TodoTask>();
	private static int todoCount = 0;
	
	public List<TodoTask> getTodos(String user) {
		List<TodoTask> filteredTodos = new ArrayList<TodoTask>();
		for(TodoTask todo: todos) {
			if(todo.getUserName().equals(user))
				filteredTodos.add(todo); 
		}
		return filteredTodos;
	}
	
	
	public TodoTask getSingleTodo(int id) {
		for (TodoTask todo: todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	public void updateTodo(TodoTask todo) {
		todos.remove(todo);
		todos.add(todo);
	}
	
	public void addTodo( String tName,  String tDesc, Date doneDate, boolean isDone) {
		todos.add(new TodoTask(++todoCount, tName, tDesc, doneDate, isDone));
	}
	
	public void deleteTodo(int id) {
		Iterator<TodoTask> iterator = todos.iterator();
		
		while(iterator.hasNext()) {
			TodoTask todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}
