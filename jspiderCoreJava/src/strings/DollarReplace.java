package strings;

import java.util.Scanner;

public class DollarReplace {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		String s1="";
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count>=2) {
				s1+='$';
			}
			else if(count==1) {
				s1+=c[i];
			}
			
			
		}
		System.out.println(s1);
	}

}
