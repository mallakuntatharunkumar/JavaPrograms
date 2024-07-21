package Object;

public class A {
		int i=5;
		static int j=10;
		public static void main(String[] args) {
			A a1= new A();
			A a2= new A();
			a2.i=30;
			a1.i=40;
			a1.j=35;
			a2.j=135;
			System.out.println(a1.i+" "+a1.j);
			System.out.println(a2.i+" "+a2.j);
		}

}
/*
40 135
30 135
*/