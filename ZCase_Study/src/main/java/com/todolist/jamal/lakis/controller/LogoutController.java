package com.todolist.jamal.lakis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.service.UserService;

//@Controller
//public class LogoutController {
//	@GetMapping("/logout")
//	public String logout(HttpSession session, @RequestParam("username")String username) {
		
//		User user = userService.findUserByUsername(username);
//		
//		if (user != null) {
//			return "redirect:/";
//		}
		
	
	

