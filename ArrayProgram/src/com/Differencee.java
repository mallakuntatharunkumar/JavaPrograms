package com;
import java.util.Scanner;
public class Differencee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=100;
		arr[1][1]=110;
		arr[1][2]=120;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr.length;j++) {
				System.out.println("Array"+i+" And "+j);
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		
	}

}
