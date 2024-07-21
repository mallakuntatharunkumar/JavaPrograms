package exceptionHandling;
import java.io.*;
public class Example6 {

	static void m1() throws FileNotFoundException{
			m2();
		}

	static void m2() throws FileNotFoundException {
			FileReader r= new FileReader("D:\\AA.java");
			System.out.println("reading done");
		}
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}
	
}