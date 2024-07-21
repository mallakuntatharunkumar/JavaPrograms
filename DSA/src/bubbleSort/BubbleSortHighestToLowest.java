package bubbleSort;

public class BubbleSortHighestToLowest {
	public static void main(String[] args) {
		int[] a = { 1, 10, 3, 4, 5, 6, 7, 8, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] < a[j + 1]) {

					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int n : a) {
			System.out.println(n);
		}
	}
}
