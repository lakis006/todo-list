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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.jamal.lakis.models.TodoList;
import com.todolist.jamal.lakis.models.TodoTask;
import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.repository.TodoTaskRepository;
import com.todolist.jamal.lakis.service.TodoListService;
import com.todolist.jamal.lakis.service.TodoTaskService;

@Controller
public class TodoController {
	@Autowired
	private TodoTaskService service;
	
	private TodoTaskRepository repo;
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@GetMapping("/list-todos")
	public String showTodosList(ModelMap model, HttpSession session) {
		String user = ((User) session.getAttribute("currentUser")).getUsername(); // getLoggedInUserName();
		List<TodoTask> list = service.getTodos(user);
		System.out.println("list size: " + list.size());
		model.addAttribute("todos", list);
		System.out.println("Returned todos successfully");
		return "list-todos";
	}
	

	
	@GetMapping("/add-todo")
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo", 
				new TodoTask(
						0,  "testUser1","Default Task Name","Default Task Desc", 
						"insert Date", false
				)
		);
		
		return "add-todo";
	}
	
	@GetMapping("/delete-todo")
	public String deleteTodo(ModelMap model, @Valid @ModelAttribute("todo") TodoTask todo, BindingResult result, HttpSession session)  {
		String user = ((User) session.getAttribute("currentUser")).getUsername();
		
		service.deleteById(todo.getId());
		
		return "redirect:/list-todos";
	}
	
	
	
	@GetMapping("/update-todo") 
	public String showUpdateTodoPage(@RequestParam("id") Integer id, ModelMap model) {
		
		model.addAttribute("updateTodo", service.findbyId(id));
		
		return "update";
	}
	
	
	@PostMapping("/update")
	public String processUpdate(ModelMap model, @Valid TodoTask todo, BindingResult result, HttpSession session) {
		User user = ((User) session.getAttribute("currentUser"));
		
		if(result.hasErrors()) {
			
			result.getFieldErrors().forEach(f -> 
			System.out.println(f.getField() + ": " + f.getDefaultMessage()));
			System.out.println("Add todo doesnt work");
			return "list-todos";
		}
	service.deleteById(todo.getId());
	service.addTodo(user.getUsername(), user.getTodolist(), todo.gettName(), todo.gettDesc(), todo.getDoneDate(),  false);
	return "redirect:/list-todos";
	}
	
	
	@PostMapping("/addtodo")
	public String addTodo(ModelMap model, @Valid TodoTask todo, BindingResult result, HttpSession session) {
		User user = ((User) session.getAttribute("currentUser"));
		
		if(result.hasErrors()) {
			
			result.getFieldErrors().forEach(f -> 
			System.out.println(f.getField() + ": " + f.getDefaultMessage()));
			System.out.println("Add todo doesnt work");
			return "list-todos";
		}
		
		service.addTodo(user.getUsername(), user.getTodolist(), todo.gettName(), todo.gettDesc(), todo.getDoneDate(),  false);
		System.out.println("Add todo works");
		List<TodoTask> list = service.getTodos(user.getUsername());
		model.addAttribute("todo", list);
		return "redirect:/list-todos";
	}
	
}
