package methods;

public class C {
	static void m1(int a) {
		System.out.println("a:"+a);
		
	}
	public static void main(String[] args) {
		m1(5);//5
		int i=6;
		m1(i);//6
		m1(i*3);//18
		
	}

}
