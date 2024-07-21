package exceptionHandling;

class AgeInValidException extends RuntimeException{
	public AgeInValidException() {
		System.out.println("Age is not valid");
	}
}
public class Example7 {
	public static void main(String[] args) {
		int age=15;
		if(age>=25 && age<=35) {
			System.out.println("Eligible");
		}
		else {
			AgeInValidException a= new AgeInValidException();
			throw a;
		}
	}
}
