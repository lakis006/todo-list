package com.todolist.jamal.lakis.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TodoTask {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //study generation type auto 
		private Integer id;
		
		@ManyToOne
	    @JoinColumn(name="listId", nullable=false)
		private TodoList tList;
		
		public TodoList gettList() {
			return tList;
		}

		public void settList(TodoList tList) {
			this.tList = tList;
		}


		private String userName;
		
		private String tName;
	
		@Size(min = 10, message = "Enter at least 8 characters...")
		private String tDesc;
		
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "MM/dd/yyyy")
		@Temporal(value = TemporalType.TIMESTAMP)
		private Date doneDate;
		
		private boolean isComplete;

		public TodoTask() {
			super();
		}

		public TodoTask(Integer id, String userName, String tName, String tDesc, Date doneDate, boolean isComplete) {
			super();
			this.id = id;
			this.userName = userName;
			this.tName = tName;
			this.tDesc = tDesc;
			this.doneDate = doneDate;
			this.isComplete = isComplete;
		}
		public boolean isComplete() {
			return isComplete;
		}
		
		public boolean getIsComplete() {
			return isComplete;
		}

		public void setComplete(boolean isComplete) {
			this.isComplete = isComplete;
		}

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
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