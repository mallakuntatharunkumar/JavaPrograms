package com;
import java.util.*;
public class Accenture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int even=0;
		int odd = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);	
	}
}