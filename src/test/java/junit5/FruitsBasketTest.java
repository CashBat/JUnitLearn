package junit5;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class FruitsBasketTest {
	
	private FruitsBasket basket = new FruitsBasket();
	private Fruit apple = new Fruit ("Apple",120);
	private Fruit orange = new Fruit ("Orange",120);
	private Fruit pear = new Fruit ("Pear",120);

	@Before
	public void intit () {
		basket.add(apple);
		basket.add(orange);
		basket.add(pear);
	}
	
	@Test
	public void testSize() { //тестируем метод getSize
		assertEquals ("Checking basket's size", 3, basket.getSize());
	}

	@Test
	public void testAdd() {//добавили один врукт, значит тест метода должен показать 4 фрукта в корзине. Проверем.
		basket.add(new Fruit("Banana", 200));
		assertEquals ("Adding one more fruit to the basket", 4, basket.getSize());
	}
	
	@Test (expected = NoSuchElementException.class)
	public void testRemoveException() {//фрукта в корзине нет, значит метод должен вызвать исключнеие. Проеряем это.
		basket.remove(new Fruit("Kiwi", 80));
		assertEquals ("Removing a fruit from the basket", 2, basket.getSize());
	}

	@Test 
	public void testRemove() {//фрукт должен удалиться
		basket.remove(orange);
		assertEquals ("Removing a fruit from the basket", 2, basket.getSize());
	}
	
	@Test 
	public void testDestroy() {//фрукт должен удалиться
		basket.removeAll();
	}

}

