package methods;

public class D {
	static void m1(int a) {
		a*=5;
		System.out.println(a);
	}
	public static void main(String[] args) {
		int a=6;
		System.out.println("In main a="+a);//6
		m1(a);//30
		System.out.println(a);//6
	}
}
