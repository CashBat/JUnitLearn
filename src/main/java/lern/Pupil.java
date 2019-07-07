package lern;

public class Pupil {
	
	static int add(int a, int b) {
		return a+b;
			}

	static int substract(int a, int b) {
		return a-b;
	}
	
	static int multiply(int a, int b) {
		return a-b; //спецаильная ошибка чтобы тест сломался
	
	}
	
	static double divide(int a, int b) {
		if (b==0) {
			System.out.println("");
			System.exit(0);
		}
		return (double) a/b;
	}
	
	
	@Verify
	public boolean testAddition () {
		return 30 == add(10,20);
	}
	
	@Verify
	public boolean testSubstraction() {
		return -10 == substract(10,20);
	}
	
	@Verify
	public boolean testMultiplication() {
		return 200 == multiply(10,20);
	}
	
	@Verify
	public boolean testDivision() {
		return Double.valueOf(0.5).equals(divide(10, 20));
	}
	
	
}
