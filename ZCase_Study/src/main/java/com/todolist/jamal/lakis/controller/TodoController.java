package com.todolist.jamal.lakis.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.service.TodoListService;

public class TodoController {
	@Autowired
	private TodoListService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@GetMapping("/list-todos")
	public String showTodosList(ModelMap model) {
		String user = getLoggedInUserName();
		model.addAttribute("todos", service.getTodos(user));
		return "list-todos";
	}
	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}
	
	@GetMapping("/add-todo")
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo", new TodoTask(0,  "Default Task Name","Default Task Desc", new Date(0), false));
		return "todo";
	}
	
	@GetMapping("/delete-todo")
	public String deleteTodo(ModelMap model, @RequestParam int id)  {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@GetMapping("/update-todo") 
	public String showUpdateTodoPage(ModelMap model, @Valid TodoTask todo, BindingResult result) {
		if (result.hasErrors()) {
			return "todo";
		}
		todo.setUserName(getLoggedInUserName());
		service.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	@PostMapping("/add-todo")
	public String addTodo(ModelMap model, @Valid TodoTask todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		service.addTodo(todo.gettName(), todo.gettDesc(), todo.getDoneDate(),  false);
		return "redirect:/list-todos";
	}
	
}
