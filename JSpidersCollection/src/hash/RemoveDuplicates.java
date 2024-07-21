package hash;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void removeDup(int[] arr) {
		int[] b = new int[arr.length];
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i-1;j>=0;j--) {
				
				if(arr[i]==arr[j]) {
					continue;
				}
			}
			
			b[count]=arr[i];
			count++;
		}
		System.out.println(Arrays.toString(b));

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 3, 2, 1 };
		removeDup(arr);

	}

}
