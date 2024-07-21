package methods;
import java.util.*;
public class E {
	static int input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		return n*n;
		
	}
	
	static int m1(int j) {
		
		return input();
		
	}
	public static void main(String[] args) {
		int output=input();
		System.out.println(output);
		
		System.out.println(input()+10);
		System.out.println(m1(input())+10);
	}
}
