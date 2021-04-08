package com.todolist.jamal.lakis.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.service.TodoListService;
import com.todolist.jamal.lakis.service.TodoTaskService;

@Controller
public class TodoController {
	@Autowired
	private TodoTaskService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@GetMapping("/list-todos")
	public String showTodosList(ModelMap model, HttpSession session) {
		String user = ((User) session.getAttribute("currentUser")).getUsername(); // getLoggedInUserName();
		List<TodoTask> list = service.getTodos(user);
		model.addAttribute("todos", list);
		System.out.println("Returned todos successfully");
		return "list-todos";
	}
	

	
	@GetMapping("/add-todo")
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo", 
				new TodoTask(
						0,  "testUser1","Default Task Name","Default Task Desc", 
						new Date(0), false
				)
		);
		
		return "add-todo";
	}
	
//	@GetMapping("/delete-todo")
//	public String deleteTodo(ModelMap model, @RequestParam int id)  {
//		service.deleteTodo(id);
//		return "redirect:/list-todos";
//	}
	
	@GetMapping("/update-todo") 
	public String showUpdateTodoPage(ModelMap model, @Valid TodoTask todo, BindingResult result) {
		if (result.hasErrors()) {
			return "list-todos";
		}
		
		service.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	@PostMapping("/add-todo")
	public String addTodo(ModelMap model, @Valid TodoTask todo, BindingResult result, HttpSession session) {
		String user = ((User) session.getAttribute("currentUser")).getUsername();
		
		if(result.hasErrors()) {
			return "list-todos";
		}
		
		service.addTodo(user, todo.gettName(), todo.gettDesc(), todo.getDoneDate(),  false);
		return "redirect:/list-todos";
	}
	
}
