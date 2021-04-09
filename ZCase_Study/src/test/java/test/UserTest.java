package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.service.TodoTaskService;
import com.todolist.jamal.lakis.service.UserService;

public class UserTest {
	static UserService eDao;
	
	public UserTest() {
		super();
		
	}
	


	@BeforeClass
	public static void setUp() {
		eDao = new UserService(null);
//		System.out.println("BeforeClass");
	}

	@Before
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@Test
	public void testsaveUser() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		User user = new User();
		
		assertEquals(true, eDao.saveUser(user));
		assertEquals(false, eDao.saveUser(user));
	}

	
	@Test
	public void findUserByUsername() { //test that passed using a student that is inside database 
		System.out.println("Testing Validation");
		User user = new User();
				
		
		assertEquals(true, eDao.findUserByUsername("jamal"));
		assertEquals(false, eDao.findUserByUsername("notaperson@balrg.com"));
	}
	
}
