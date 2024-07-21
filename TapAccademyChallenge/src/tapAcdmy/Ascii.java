package tapAcdmy;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char c=(char)n;
		if(c =='A'||c == 'E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
	}

}



