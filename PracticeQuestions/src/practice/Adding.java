package practice;
import java.util.Scanner;
public class Adding {
	
	Adding(int a,int b){
		 System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println();
		int c = s.nextInt();
		System.out.println();
		int d = s.nextInt();
		Adding add = new Adding(c,d);
	}

}
