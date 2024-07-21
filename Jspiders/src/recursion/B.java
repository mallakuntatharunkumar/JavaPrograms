package recursion;

public class B {
	public static void main(String[] args) {
		m1(1);
	}
	static void m1(int i) {
		System.out.println(i);
		if(i>=5) return;
		m1(i+1);
		System.out.println(i);
		m1(1+i);
		
		System.out.println(i);
	}
}

