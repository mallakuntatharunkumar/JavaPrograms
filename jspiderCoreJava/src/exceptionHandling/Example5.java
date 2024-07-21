package exceptionHandling;
import java.io.*;
public class Example5 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			FileReader r= new FileReader("C:\\Users\\M tharun kumar\\Downloads\\todo-List-main (1)\\todo-List-main");
			System.out.println("File Readed");
		}
		catch(Throwable e) {
			System.out.println("handled");
		}
		System.out.println("Main ends");
	}
}
