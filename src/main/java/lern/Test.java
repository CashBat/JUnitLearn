package lern;

public class Test {

	public static void bubbleSorter(int[] arr) { // ÌÅÒÎÄ ÏÓÇÛĞÜÊÎÂÎÉ ÑÎĞÒÈĞÎÂÊÈ
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // Âíåøíèé öèêë
			for (int j = 0; j < n - i - 1; j++) { // Âíóòğåííèé öèêë
				if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
				}
			}
		}
	}

}
