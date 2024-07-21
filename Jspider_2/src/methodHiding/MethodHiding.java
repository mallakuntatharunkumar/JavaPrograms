package methodHiding;

class Method1{
	int a=10;
	 void m1() {
		System.out.println("Tharun-m1-method1");
	}
	 static void m2() {
		 System.out.println("Static-m1-Method1");
	 }
}
class Method2 extends Method1{
	int a=20;
	@Override
	 void m1() {
		super.m1();
		
		System.out.println("Tharun-m1-method2");
	}
	static void m2() {
		 System.out.println("Static-m1-Method1");
	 }
}
class Method3 extends Method2{
	@Override
	 void m1() {
		super.m1();
			System.out.println("Tharun-m1-method3");
		}
}
public class MethodHiding {
	public static void main(String[] args) {
	Method1 m=	new Method2();
		m.m2();
		System.out.println(m.a);
	}
}
