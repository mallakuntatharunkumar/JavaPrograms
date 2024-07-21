package strings;

import java.util.Scanner;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
