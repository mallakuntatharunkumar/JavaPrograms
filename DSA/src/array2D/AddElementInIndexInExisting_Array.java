package array2D;

import java.util.Arrays;

public class AddElementInIndexInExisting_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int index = 1;
		int value = 6;
		a=add(a, index, value);
		System.out.println(Arrays.toString(a));
		
	}

	public static int[] add(int[] a, int index, int value) {
		int[] b = new int[a.length + 1];
		if (index < 0 || index >= a.length) {
			return a;
		}
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		b[index] = value;
		for (int j = index; j < a.length; j++) {
			b[j + 1] = a[j];
		}

		return b;

	}

}
