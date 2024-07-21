
package exceptionHandling;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		int a=10;
		int b=0;
		String s=null;
		try {
			System.out.println(s.length());
			System.out.println(a/b);
			int [] arr= {1,2,3,4,5};
			System.out.println(arr[10]);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic expecption block");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound exception");
		}
		catch(Exception e) {
			System.out.println("Exception type");
		}
		System.out.println("main ends");
	}
}
