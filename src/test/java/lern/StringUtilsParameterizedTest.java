package lern;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class StringUtilsParameterizedTest {
	
//	private Integer boo;
//	private Integer arg=2;
//
//	public StringUtilsParameterizedTest(Integer boo) {
//		this.boo = boo;
//	}
//
//	@Parameters
//	public static Collection<Object[]> getTestParameters() {
//
//		Integer[][] a = new Integer[][] { {1}, { 2}, { 3 } };
//		return Arrays.asList(a);
//	}
//
//	@Test
//	public void testAre2CharsAtHeadAndTailEqual() {
//		StingUtils su = new StingUtils();
//		assertEquals(boo, arg);
//	}
	
//	private Boolean boo;
//	private String arg;
//
//	public StringUtilsParameterizedTest(Boolean boo, String arg) {
//		System.out.println("sss");
//		this.boo = boo;
//		this.arg = arg;
//	}
//
//	@Parameters
//	public static Collection<Object[]> getTestParameters() { //перед тестом юзаетс€ конструктор, его пол€(boo и arg) заполн€етс€ из этой колекции объектов. “ест завалитс€ если какогото значени€ в масиве будет не хватать дл€ заполнени€ аргумента({ Boolean.FALSE})
//
//		Object[][] a = new Object[][] { { Boolean.FALSE, "1234" }, { Boolean.TRUE, "1212" }, { Boolean.FALSE, "1" }, { Boolean.TRUE, "12" } };
//		return Arrays.asList(a);
//	}
//
//	@Test
//	public void testAre2CharsAtHeadAndTailEqual() {
//		StingUtils su = new StingUtils();
//		assertEquals(boo, su.are2CharsAtHeadAndTailEquel(arg));
//	}

	
	private User expecteds;
	private User arg;


	public StringUtilsParameterizedTest(User expecteds, User arg) {
		this.expecteds = expecteds;
		this.arg = arg;
	}

	@Parameters 
	public static Collection<User[]>getTestParameters() { //перед тестом юзаетс€ конструктор, его пол€(boo и arg) заполн€етс€ из этой колекции объектов. “ест завалитс€ если какогото значени€ в масиве будет не хватать дл€ заполнени€ аргумента({ Boolean.FALSE})
		User user = new User("Pasha",26);	
		
									       //перва€ строка                     втора€
									  //первый столбец     второй
		User[][] a = new User[][] { { new User("Pasha",27), user }, { new User("Pasha",28),user } };
		return Arrays.asList(a); //возвращаетс€ двумерный массив - двумерный потомучто нужно задать два индекса дл€ нахождени€ нужного объекта, а не потомучто тут типо два параметра(столбца)
	}

	/**
	 * создает юзера 26 лет, создает массив ожидаемых (expecteds) юзеров. “агже в него засовываетс€ юзер который будет поддвергатьс€ изменению arg. кажда€ строка масива, это новый тест в будующем.
	 * данный масив возвращаетс€ в jUnit классы, запускаетс€ цикл, где он начинает перебиратьс€. ¬ процессе перебора, создаетс€ конструктор теста, в него каждый раз сасовываютс€ параметры с масива. expecteds- ожидаемый юзер уже с увеличеным числом лет и ссылка на юзера который подвергаетс€ изменению-посути аргумент дл€ провер€емого метода (upUserAge)
	 * конструктор создалс€, его пол€ заполнелись, далее запускаетс€ метод с логигой теста (testAre2CharsAtHeadAndTailEqual). ƒл€ своих операций, он использует данные полей, заполненых конструктором на текущей итерации.
	 * так как юзер аргумент не пересоздаетс€ (метод getTestParameters вызываетс€ всего один), ссылка на него сохран€етс€ из теста в тест, и поэтому сохрон€етс€ реузльтат изменени€ возвраста из прошлого теста
	 */
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual() {
		StingUtils su = new StingUtils();
		su.upUserAge(arg);
		User actual = arg;
		assertEquals(expecteds, actual);
	}

	
	
}
