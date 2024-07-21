package exceptionHandling;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Main start");
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
			
		}
		catch(ArithmeticException e) {
			System.out.println("We cant divid");
		}
	}

}
