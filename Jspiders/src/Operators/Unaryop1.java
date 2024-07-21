package Operators;

public class Unaryop1 {
	public static void main(String[] args) {
		int a=0,b=0;
		b=a++ + ++a;//b=0+2//2
		System.out.println(a);
		System.out.println(b);//2
		m1();
	}
	static void m1() {
		int a=0;
		a=a++;
		System.out.println(a);//0 explaination 0 1 0
	}

}
