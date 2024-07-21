package upcasting;

class A {
	int i = 10;

	void m1() {
		System.out.println("M1-A");
	}

}

class B extends A {
	int i = 20;

	void m1() {
		System.out.println("M1-B");
	}

}

class C extends A {
	int i = 30;

	void m1() {
		System.out.println("M1-C");
	}

}

public class Test {
	
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a = new C();
		System.out.println(a.i);

		a.m1();
		a = new B();
		a.m1();
	}

}
