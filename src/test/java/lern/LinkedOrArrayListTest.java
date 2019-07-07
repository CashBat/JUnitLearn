package lern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedOrArrayListTest {

	static List<String> arrayList;
	static List<String> linkedList;
	//тестируем производительность
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Popelating ArrayList... ");
		 arrayList = new ArrayList<> ();
		 for (int i = 0; i <10_000_000;i++){
			 arrayList.add(""+i);
		 }
		 System.out.println("Done.");
		 linkedList = new LinkedList<>(arrayList);
		 
	}
	
	@Test(timeout = 1) //� �������������(�� 6 ����� ������ ��� ����)
	public void testRemoval_LL() {
		LinkedOrArrayList.remove(linkedList, "123");		
	}
	
	
	@Ignore (value = "Removal on ArrayList takes too long "
			+ "so we disable it for the time being")
	@Test(timeout = 6)
	public void testRemoval_AL() {
		LinkedOrArrayList.remove(arrayList, "123");		
	}
}
