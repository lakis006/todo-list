package com.todolist.jamal.lakis.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50, name="name")
	@Size(min = 2, max = 25)
	private String username;
	
	@Column(length=50, name="email")
	@Email
	@NotEmpty(message="Email can't be empty")
	private String email;

	@Column(length=50, name="password")
	@NotEmpty(message="Password can't be empty")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private TodoList todolist;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public TodoList getTodolist() {
		return todolist;
	}


	public void setTodolist(TodoList todolist) {
		this.todolist = todolist;
	}

	private String role;
	
	@Override
	public String toString() {
		return "User [userId=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", role=" + role;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}





	public User() {
		super();
		this.todolist = new TodoList();
		this.role = "user";
	
	}
	
	public User(String role) {
		this.role = role;
	
	}


	public User(String username, String email, String password) {
		this();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Integer getUserId() {
		return id;
	}

	public void setUserId(Integer userId) {
		this.id = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
