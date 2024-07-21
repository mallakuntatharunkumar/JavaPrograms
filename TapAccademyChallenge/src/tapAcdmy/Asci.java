package tapAcdmy;

import java.util.Scanner;

/*
 Write a program which converts each character of an input string as an ASCII
value and stores each of these numbers in an array. Print that array
 */
public class Asci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String s = sc.nextLine();
		int[] asci = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			asci[i] = (int) s.charAt(i);
		}
		for(int n:asci) {
			System.out.print(n+" ");
		}
	}

}
