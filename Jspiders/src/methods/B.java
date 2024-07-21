package methods;

public class B {
	static int m1() {
		System.out.println("M1 is executing");
		return 10;
		
	}
	public static void main(String[] args) {
		m1();//empty
		
		
		int a =m1();
		System.out.println(a);//10
		
		
		int j=m1()*2;
		System.out.println(j);//20
		
		
		System.out.println(m1());//10
	}
}
