package strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		if(isPalindrome(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;//3-1//2
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
		
	}

}
