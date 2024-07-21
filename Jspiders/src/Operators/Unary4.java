package Operators;

public class Unary4 {
	public static void main(String[] args) {
		int a=0;
		a=++a;
		System.out.println(a);//1
		a=++a;
		System.out.println(a);//2
		a=a++;
		System.out.println(a);//2
		a=a++;
		System.out.println(a++);//2
		System.out.println(a);//3
	}

}
