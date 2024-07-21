package array;

import java.util.Arrays;

public class ReplaceArrayValue {
	public static void main(String[] args) {
		int[] ar = { 0, 3, 2, 1, 100, 4, 5, 6, 7, 8, 100, 100 };
		
		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}
		}

		// Arrays.sort(ar);

		for (int n : ar) {
			System.out.println(n);
		}
	}
}