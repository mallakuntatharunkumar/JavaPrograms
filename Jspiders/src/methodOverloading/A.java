package methodOverloading;

public class A {
	public static void main(String[] args) {
		m1(10,10);
	}
	public static void m1(int a,double b) {
		System.out.println(a+" "+b);
	}
	
//	public static void m1(double a,int b) {
//		System.out.println(a+" "+b);
//	}
	
	
}
