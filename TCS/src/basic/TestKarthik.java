package basic;

import java.util.Scanner;

public class TestKarthik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max=-10000000;//1
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		}
		System.out.println(count);
//		int max1=Integer.MAX_VALUE;
//		System.out.println(max1);
	}
//1,2,3,4,5
}
