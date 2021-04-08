package com.todolist.jamal.lakis.repository;

import org.springframework.data.repository.CrudRepository;


import com.todolist.jamal.lakis.models.TodoTask;

public interface TodoTaskRepository extends CrudRepository<TodoTask, Integer> {

}
