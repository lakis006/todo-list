package com.todolist.jamal.lakis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todotasks")
public class Admin {
	@Id
	@Column(length=50, nullable=false, unique=true, name="adminId")
	private int id;
	@Column(length=50, nullable=false, name="aName")
	private String aName;
	
	public Admin() {
		super();
	}
	
	public Admin(int id, String aName) {
		super();
		this.id = id;
		this.aName = aName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}

}
