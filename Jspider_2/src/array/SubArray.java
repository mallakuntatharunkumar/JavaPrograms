package array;

import java.util.Arrays;

public class SubArray {
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,1,1,0,2,1,0};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i;j<arr.length;j++) {
//				for(int k=i;k<j;k++) {
//					System.out.print(arr[k]+" ");
//				}
//				System.out.println();
//			}
//		}
		Arrays.sort(arr);
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
	}
}
