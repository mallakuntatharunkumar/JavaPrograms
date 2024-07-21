package strings;

import java.util.Scanner;

public class PossiblePalindromes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(psblePalindrome(s,i,j)) {
					System.out.println(s.substring(i,j+1));
				}
			}
		}
	}
	
	public static boolean psblePalindrome(String s,int start,int end) {
		int i=start,j=end;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
		
	}
}
