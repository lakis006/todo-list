package com.todolist.jamal.lakis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.todolist.jamal.lakis.models.TodoList;

public interface TodoListRepository extends CrudRepository<TodoList, Integer>{
//	List <TodoList> findUserName(String user);
}
