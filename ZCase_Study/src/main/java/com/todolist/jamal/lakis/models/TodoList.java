package com.todolist.jamal.lakis.models;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "Todo-list")
public class TodoList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //study generation type auto 
	private Integer id;
	
	@OneToMany(targetEntity = TodoTask.class, fetch=FetchType.EAGER)
	List<TodoTask> tasks;
	
	public TodoList() {
		super();
	}

	public TodoList(Integer id) {
		this.tasks = new ArrayList<>();
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
