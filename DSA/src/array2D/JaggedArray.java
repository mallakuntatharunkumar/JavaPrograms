package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter:" );
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int[] n:a) {
			System.out.println(Arrays.toString(n));
		}
	}

}
