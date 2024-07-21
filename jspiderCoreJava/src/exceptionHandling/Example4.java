package exceptionHandling;

public class Example4 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("DB open");
		try {
			System.out.println(10 / 0);
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		} finally {
			System.out.println("DB closed");
		}
		System.out.println("main ends");
	}
}
