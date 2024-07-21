package com;

public class LargestNumber {
	public static void main(String[] args) {
		int[] array = {10,500,20,30,240,40,23,12,34,90,120,600};
		
		int max=array[0];
		for(int i = 1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
		
	}

}
