package junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		String wish = "Bonne anne et bonne sante!";
	
		String[] actual =FruitsBasket.greet(wish);
		Arrays.stream(actual).forEach(System.out::println);
	}

}
