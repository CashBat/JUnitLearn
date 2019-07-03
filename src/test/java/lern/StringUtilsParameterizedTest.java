package lern;

import static org.junit.Assert.*;

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
	
	private Boolean boo;
	private String arg;

	public StringUtilsParameterizedTest(Boolean boo, String arg) {
		System.out.println("sss");
		this.boo = boo;
		this.arg = arg;
	}

	@Parameters
	public static Collection<Object[]> getTestParameters() { //перед тестом юзается конструктор, его поля(boo и arg) заполняется из этой колекции объектов. Тест завалится если какогото значения в масиве будет не хватать для заполнения аргумента({ Boolean.FALSE})

		Object[][] a = new Object[][] { { Boolean.FALSE, "1234" }, { Boolean.TRUE, "1212" }, { Boolean.FALSE, "1" }, { Boolean.TRUE, "12" } };
		return Arrays.asList(a);
	}

	@Test
	public void testAre2CharsAtHeadAndTailEqual() {
		StingUtils su = new StingUtils();
		assertEquals(boo, su.are2CharsAtHeadAndTailEquel(arg));
	}

}
