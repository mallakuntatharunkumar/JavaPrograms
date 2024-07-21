package com;
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		
	
	Assignment a = new Assignment();
	Scanner sc = new Scanner(System.in);
	
		for(int i=1;i<=5;i++) {
			System.out.print("Enter Value to Check:");
			int t = sc.nextInt();
			a.positiveNegetive(t);
			System.out.println("-----------------------");
		}
}
}

/*
Output:
-------
Enter Value to Check:10
10 is a Positive number
-----------------------
Enter Value to Check:-1
-1 is a negetive number
-----------------------
Enter Value to Check:90
90 is a Positive number
-----------------------
Enter Value to Check:-2
-2 is a negetive number
-----------------------
Enter Value to Check:34
34 is a Positive number
-----------------------

//check the value that given  number is positiv enumber negetive number
*/
