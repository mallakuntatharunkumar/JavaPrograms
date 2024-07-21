package strings;
import java.util.Scanner;
public class MinOccureanceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		char[] s1=new char[1];
		int maincount=s.length();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				
			}
			//System.out.println(s.charAt(i)+":"+count);
			if(maincount>count) {
				maincount=count;
				s1[0]=s.charAt(i);
			}
		}
		for(char n:s1) {
		System.out.print(s1);
		System.out.print(":"+maincount);
		}
	}

}
