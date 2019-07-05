package lern;

import java.util.List;

public class LinkedOrArrayList {

	public static void remove(List<String> list, String elem){
	
		System.out.println(list.getClass().getSimpleName()+":\t");
		long start = System.nanoTime();
		list.remove(elem);
		long stop = System.nanoTime();
		Double resultTimeout =(double) stop - start;
		
		System.out.println("took "+resultTimeout/1000000 + " ml.");
		
	
		
	}
	
	
}
