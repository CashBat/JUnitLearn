package lern;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class StringUtilsTest {
	static User kolya = new User("Kolya",24);

	// "  **" --> "**", " **" ---> "**", "****" ---> "****", "** " ---> "**  "
	
//	@Test
//	public void testChopOff2StarsAtHead() {
//	assertEquals("**", lern.StingUtils.chopOff2StarsAtHead("  **"));
//	assertEquals("**", lern.StingUtils.chopOff2StarsAtHead("  **"));
//	assertEquals("****", lern.StingUtils.chopOff2StarsAtHead("****"));
//	assertEquals("**  ", lern.StingUtils.chopOff2StarsAtHead("**  "));
//	
//	}
//	
//	@Test
//	public void testChopOff2StarsAtHead_Note() {
//	assertEquals("****", lern.StingUtils.chopOff2StarsAtHead("****"));
//	}
	
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("in setUpBeforeClass()");
		kolya.setAge(4445);
	}
	
	
	@Before
	public void setUp(){
		System.out.print("in setUp()");
		
	}
	
	@Test
	public void test1(){
		System.out.print("in test1()");
	//	kolya.setAge(335);
		System.out.println(kolya.getAge());
	}
	
	@Test
	public void test2(){
		System.out.print("in test2()");
		System.out.println(kolya.getAge());
	}
	
	@After
	public void after(){
		kolya.setAge(335);
		System.out.print("in After()");
//		System.out.println(kolya.getAge());
	}
	
	@AfterClass
	public static void tearnDownAfterClass(){
		kolya.setAge(4445);
		System.out.println("in tearnDownAfterClass()");
	
	}
}
