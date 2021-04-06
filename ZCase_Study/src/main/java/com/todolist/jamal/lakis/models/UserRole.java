package com.todolist.jamal.lakis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRole")
public class UserRole {
	@Id
	@Column(length=50, unique=true)
	private int id;
	@Column(length=50, nullable=false)
	private String role;
	
	public UserRole() {
		super();
	}
	
	public UserRole(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getaName() {
		return role;
	}
	public void setaName(String role) {
		this.role = role;
	}

}
