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
//	public static Collection<Object[]> getTestParameters() { //����� ������ ������� �����������, ��� ����(boo � arg) ����������� �� ���� �������� ��������. ���� ��������� ���� �������� �������� � ������ ����� �� ������� ��� ���������� ���������({ Boolean.FALSE})
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
	public static Collection<User[]>getTestParameters() { //����� ������ ������� �����������, ��� ����(boo � arg) ����������� �� ���� �������� ��������. ���� ��������� ���� �������� �������� � ������ ����� �� ������� ��� ���������� ���������({ Boolean.FALSE})
		User user = new User("Pasha",26);	
		
									       //������ ������                     ������
									  //������ �������     ������
		User[][] a = new User[][] { { new User("Pasha",27), user }, { new User("Pasha",28),user } };
		return Arrays.asList(a); //������������ ��������� ������ - ��������� ��������� ����� ������ ��� ������� ��� ���������� ������� �������, � �� ��������� ��� ���� ��� ���������(�������)
	}

	/**
	 * ������� ����� 26 ���, ������� ������ ��������� (expecteds) ������. ����� � ���� ������������ ���� ������� ����� ������������� ��������� arg. ������ ������ ������, ��� ����� ���� � ��������.
	 * ������ ����� ������������ � jUnit ������, ����������� ����, ��� �� �������� ������������. � �������� ��������, ��������� ����������� �����, � ���� ������ ��� ������������ ��������� � ������. expecteds- ��������� ���� ��� � ���������� ������ ��� � ������ �� ����� ������� ������������ ���������-������ �������� ��� ������������ ������ (upUserAge)
	 * ����������� ��������, ��� ���� �����������, ����� ����������� ����� � ������� ����� (testAre2CharsAtHeadAndTailEqual). ��� ����� ��������, �� ���������� ������ �����, ���������� ������������� �� ������� ��������.
	 * ��� ��� ���� �������� �� ������������� (����� getTestParameters ���������� ����� ����), ������ �� ���� ����������� �� ����� � ����, � ������� ����������� ��������� ��������� ��������� �� �������� �����
	 */
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual() {
		StingUtils su = new StingUtils();
		su.upUserAge(arg);
		User actual = arg;
		assertEquals(expecteds, actual);
	}

	
	
}
