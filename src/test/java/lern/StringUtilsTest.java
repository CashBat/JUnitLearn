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
	
	@Test
	public void testBubleSort() {
		int [] arr = {4,12,-17,3};
		int [] expected = {-17,3,4,12};
		lern.Test.bubbleSorter(arr);
		assertArrayEquals(expected, arr);
	}
	
	
	
	
	@Test(expected=NullPointerException.class)
	public void testBubleSort_exceptnull() { //правельный сценарий состоит в том что будет исключение.
		int [] arr = null;
		int [] expected = {-17,3,4,12};
		lern.Test.bubbleSorter(arr);// в методе возникала ошибка, если она вылезла то тест прошел(проверка как будет вести себя программа если выпадет null)
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void testUser() {
		User expected = new User("Имя", 24);
		User actual = new User("Имя", 24);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testLink() { //сравнение физического местоположения объектов(ода и таже ссылка), переопределенный метод equals игнорируется
		User expected = new User("Имя", 24);
		User actual = new User("Имя", 24);
		assertSame(expected,expected);
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
