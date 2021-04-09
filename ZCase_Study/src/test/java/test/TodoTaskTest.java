package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.todolist.jamal.lakis.service.TodoTaskService;




public class TodoTaskTest {
	static TodoTaskService eDao;
	
	public TodoTaskTest() {
		super();
		
	}
	


	@BeforeClass
	public static void setUp() {
		eDao = new TodoTaskService(null);
//		System.out.println("BeforeClass");
	}

	@Before
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@Test
	public void testGetOneTodo() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		assertEquals(true, eDao.findbyId(2));
		assertEquals(false, eDao.findbyId(0));
	}

	
	@Test
	public void testGetAllTodos() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		assertEquals(true, eDao.getTodos("cstartin3@flickr.com"));
		assertEquals(false, eDao.getTodos("notaperson@balrg.com"));
	}
	
	
	@Test
	public void testAddTodo() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		assertEquals(true, eDao.getTodos("cstartin3@flickr.com"));
		assertEquals(false, eDao.getTodos("notaperson@balrg.com"));
	}
	
	



}
