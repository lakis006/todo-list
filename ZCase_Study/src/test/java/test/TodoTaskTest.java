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
	public void testValidateStudent() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		assertEquals(true, eDao.validateStudent("cstartin3@flickr.com", "XYHzJ1S"));
		assertEquals(false, eDao.validateStudent("notaperson@balrg.com", "isuegdfa"));
	}




}
