package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAndPrint2D_Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[][] arr=new int[2][2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter:");
				System.out.println(arr[i][j]=sc.nextInt());
			}
		}
		for(int[] n:arr) {
			System.out.println(Arrays.toString(n));
		}
	}
}
