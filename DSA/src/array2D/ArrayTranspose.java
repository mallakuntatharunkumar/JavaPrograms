package array2D;

import java.util.Arrays;

public class ArrayTranspose {
	public static void main(String[] args) {
		int[][] ar= {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		transpose(ar);
	}
	private static void transpose(int[][] ar) {
			int[][]ar_transpose=new int[ar.length][ar.length];
		for(int i=0;i< ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar_transpose[j][i]=ar[i][j];
			}
		}
		for(int[] row:ar_transpose) {
			System.out.println(Arrays.toString(row)+" ");
		}
	}
	
	

}
