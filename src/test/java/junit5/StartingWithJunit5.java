package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import static java.time.Duration.ofMillis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class StartingWithJunit5 {
	
	private FruitsBasket basket = new FruitsBasket();
	private Fruit apple = new Fruit ("Apple",120);
	private Fruit orange = new Fruit ("Orange",120);
	private Fruit pear = new Fruit ("Pear",120);

	@BeforeEach
	public void intit () {
		basket.add(apple);
		basket.add(orange);
		basket.add(pear);
	}
	
	@Test
	public void testSize() { //тестируем метод getSize
		assertEquals (3, basket.getSize(),"Checking basket's size");
	}

	@Test
	public void testAdd() {//добавили один врукт, значит тест метода должен показать 4 фрукта в корзине. Проверем.
		basket.add(new Fruit("Banana", 200));
		assertEquals (4, basket.getSize(),"Adding one more fruit to the basket");
	}
	
	@Test
	public void testRemoveException() {//фрукта в корзине нет, значит метод должен вызвать исключнеие. Проеряем это.
		assertThrows(NoSuchElementException.class, ()->basket.remove(new Fruit("Kiwi", 80)));
	}
	
	@Test
	public void testRemoveTime() {
		assertTimeout(ofMillis(2), ()->basket.remove(orange));
	}
	
	@Test
	public void testForTruth() {
		List<Fruit> lot = Arrays.asList(new Fruit("Peach",100),new Fruit("Tangerine",50),new Fruit("Mango",150));
		assertTrue(basket.addLot(lot),"Adding a lot of Fruit");
	}

	@Test 
	public void testRemove() {//фрукт должен удалиться
		basket.remove(orange);
		assertEquals (2, basket.getSize(),"Removing a fruit from the basket");
	}
	
	
	
	@AfterEach
	public void testDestroy() {//фрукт должен удалиться
		basket.removeAll();
	}
	
	@Test
	void testArrays() {//получит 5 слов, уберет воскл знак
		String wish = "Bonne anne et bonne sante!";
		String[] expected ={"Bonne", "anne", "et", "bonne", "sante"};
		String[] actual =FruitsBasket.greet(wish);
		assertArrayEquals(expected, actual);
	}

}
