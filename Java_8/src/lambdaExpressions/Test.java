package lambdaExpressions;
interface I1{
	void m1();
	
}
public class Test {
	public static void main(String[] args) {
		
			I1 i=()->System.out.println("M1");
			i.m1();
		
		
	}
}
