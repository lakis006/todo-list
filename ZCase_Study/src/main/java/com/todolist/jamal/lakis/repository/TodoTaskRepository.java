package com.todolist.jamal.lakis.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;

public interface TodoTaskRepository extends CrudRepository<TodoTask, Integer> {

	

	

	//void save(String user, String gettName, String gettDesc, Date doneDate, boolean b);

}
