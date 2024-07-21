package chaining;

import java.util.Scanner;

public class Practice {
	int age;
	
	Practice(int a){
		this.age = a;
		System.out.println("age:"+age);
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int x= sc.nextInt();
		

		Practice p = new Practice(x);
		System.out.println(p.age);
	}
}
