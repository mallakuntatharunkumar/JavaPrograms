package basics;
import java.util.Scanner;
public class Book {
	String title;
	String author;
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Title:");
			b1.title = sc.next();
			System.out.println("Enter Author:");
			b1.author = sc.next();
			System.out.println("TITLE:"+b1.title);
			System.out.println("Author:"+b1.author);
			
		}
		
	}

}
