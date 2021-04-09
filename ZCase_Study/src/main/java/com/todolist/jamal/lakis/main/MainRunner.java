package com.todolist.jamal.lakis.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.todolist.jamal.lakis.service.TodoListService;
import com.todolist.jamal.lakis.service.TodoTaskService;



public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ZCase_Study");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
//		TodoTaskService ss = new TodoTaskService();
		TodoListService cs = new TodoListService();

//		ss.getTodos("testuser1").forEach(System.out::println);;
//		cs.getAllCourses().forEach(System.out::println);
//		ss.getStudentByEmail("sbowden1@yellowbook.com");
//		ss.validateStudent("cjaulme9@bing.com", "FnVklVgC6r6");
//		ss.registerStudentToCourse("qllorens2@howstuffworks.com", 5);
//		ss.getStudentCourses("qllorens2@howstuffworks.com");
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
