package basics;

public class StaticConcept {
	static int i=100;
	public static void main(String[] args) {
		System.out.println(i);
		i=200;
		System.out.println(i);
		m1();
		
	}
	public static void m1() {
		System.out.println(i);
		i=300;
		m2();
	}
	
	public static void m2() {
		System.out.println(i);//200
		System.out.println(StaticConcept.i);//200
	}
	

}
