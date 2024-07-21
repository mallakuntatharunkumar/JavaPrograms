package recursion;

public class C {
	public static void main(String[] args) {
		m1(1);
	}
	static void m1(int i) {
		System.out.println(i);
		if(i>=3) return ;
		m1(i+1);
		System.out.println(i);
		m1(++i);
		System.out.println(i);
		
		
	}
}
//1 2 3 2 1 2 1