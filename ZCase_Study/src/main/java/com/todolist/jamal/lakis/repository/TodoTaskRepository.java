package com.todolist.jamal.lakis.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.models.User;

@Repository
public interface TodoTaskRepository extends CrudRepository<TodoTask, Integer> {
	

}
