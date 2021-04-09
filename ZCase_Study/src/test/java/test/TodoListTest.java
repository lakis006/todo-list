package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.todolist.jamal.lakis.models.User;
import com.todolist.jamal.lakis.service.TodoListService;
import com.todolist.jamal.lakis.service.TodoTaskService;
import com.todolist.jamal.lakis.service.UserService;

public class TodoListTest {
	static TodoListService eDao;
	
	public TodoListTest() {
		super();
		
	}
	


	@BeforeClass
	public static void setUp() {
		eDao = new TodoListService();
//		System.out.println("BeforeClass");
	}

	@Before
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@Test
	public void getTodoList(int id) { //test that passed using a student that is inside database 
		System.out.println("Testing getTodoLIST");
		User user = new User("jamal");
		
		assertEquals(true, eDao.getTodoList(id));
		assertEquals(false, eDao.getTodoList(user.getId()));
	}

	
//	@Test
//	public void addTodoList(int id) { //test that passed using a student that is inside database 
//		System.out.println("Testing add TodoLIST");
//		Integer user = new User().getId();
//		assertEquals(true, eDao.addTodoList(user));
//		assertEquals(false, eDao.addTodoList(user));
//	}
	
}
