package Object;

public class B {
	int i = 5;
	static int j = 10;

	public static void main(String[] args) {
		B b1 = new B();
		b1.i = 100;
		b1.j = 200;
		B b2 = new B();
		b2.i = 1000;
		b2.j = 2000;
		b1.display();
		b2.display();

	}

	public void display() {
		System.out.println(i + " " + j);
	}

}
/*
 100 2000
1000 2000
*/
