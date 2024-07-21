package com;

public class SmallestNumber {

	public static void main(String[] arg) {
		int[] arr= {12,23,45,3,45,56,21,89};
		
		int min=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>min) {
				min=arr[i];
				index=i;
			}
			
		}
		System.out.println("Index:"+index);
		System.out.println("Minimum:"+min);
	}

}
