package exceptionHandling;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			int[] arr= {1,2,3,4,5};
			try {
				System.out.println(arr[10]);
			}
			catch(ArithmeticException e){
				System.out.println("AE");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		}
	}

}
