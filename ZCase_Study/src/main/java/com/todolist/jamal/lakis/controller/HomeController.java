package com.todolist.jamal.lakis.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.service.UserService;

@Controller
public class HomeController {
	private UserService userService;
	
	@Autowired
	public HomeController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/") //method handling a get request which returns the index page 
	public String showIndexPage(HttpSession session) {
		if(session.getAttribute("currentUser") != null) {
			return "welcome";
		}
		return "redirect:/login";
	}
	
	@GetMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String showContactPage() {
		return "contact";
	}
	
	@GetMapping("/saveHardCodedUser")
	public String saveHardCodedUser() {
		User u = new User("testuser1", "jsquad@aol.com", "pass1");
		userService.saveUser(u);
		return "login";
	}
	
	@GetMapping("/admin")
	public String showAdminPage() {
		return "admin";
	}
	
	@GetMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerNewUser(@Valid @ModelAttribute("user")User user,
			BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		user.setPassword(user.getPassword()); //encrypt password in user.getPassword()
		userService.saveUser(user);
		return "redirect:/login";
	}
	
	@GetMapping("/login") 
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/login") 
	public String processLoginRequest(@RequestParam("username")String username, 
			@RequestParam("password") String password, Model model, HttpSession session) {
		User user = userService.findUserByUsername(username);
		
		
		if (user != null  && password.equals(user.getPassword())) {
			session.setAttribute("currentUser", user);
			System.out.println("Login Succeeded");
			return "redirect:/";
		} else 
			
		model.addAttribute("loginFailedMessage", "Login Invalid");
		
		return "login";
	}
}
