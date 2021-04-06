package com.todolist.jamal.lakis.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
public class TodoTask {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //study generation type auto 
		private int id;
		
		
		private String userName;
		
		private String tName;
	
		@Size(min = 10, message = "Enter at least 8 characters...")
		private String tDesc;
		
		
		private Date doneDate;
		

		public TodoTask() {
			super();
		}

		public TodoTask(int id, String tName, String tDesc, Date doneDate, boolean isComplete) {
			super();
			this.id = id;
			this.tName = tName;
			this.tDesc = tDesc;
			this.doneDate = doneDate;
		}
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String gettName() {
			return tName;
		}


		public void settName(String tName) {
			this.tName = tName;
		}


		public String gettDesc() {
			return tDesc;
		}


		public void settDesc(String tDesc) {
			this.tDesc = tDesc;
		}


		public Date getDoneDate() {
			return doneDate;
		}


		public void setDoneDate(Date doneDate) {
			this.doneDate = doneDate;
		}




}