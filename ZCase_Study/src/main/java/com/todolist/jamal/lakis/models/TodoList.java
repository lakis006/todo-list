package com.todolist.jamal.lakis.models;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
public class TodoList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //study generation type auto 
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	@OneToMany(targetEntity = TodoTask.class, fetch=FetchType.EAGER)
	List<TodoTask> tasks;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public void addTasks(TodoTask task) {
		this.tasks.add(task);
	}
	
	
	
	public TodoList() {
		super();
		this.tasks = new ArrayList<>();
	}

	public TodoList(Integer id) {
		this();
		this.id = id;
	}


	public List<TodoTask> getTasks() {
		return tasks;
	}


	public void setTasks(List<TodoTask> tasks) {
		this.tasks = tasks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
 
}
