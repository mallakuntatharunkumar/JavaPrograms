package hash;

import java.util.*;

public class Linked_Test {
	public static void duplicatesRemove(int[] arr) {

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 3, 2, 1 };

		duplicatesRemove(arr);

	}
}
