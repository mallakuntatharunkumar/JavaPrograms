package loops;

import java.util.Scanner;

public class DuplicateLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		System.out.print("Enter the character:");
		char s1=sc.next().charAt(0) ,s2;
		int count = 0;
		for(int i=0;i<s.length()-1;i++) {
			s2=s.charAt(i);
			if(s1==s2) {
				count++;
			}
		}
		System.out.println(s1+":"+count);
		
	}

}
