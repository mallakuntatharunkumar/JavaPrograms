package switchcase;
import java.util.*;
public class Caluculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("+,-,*,/,%");
		System.out.print("Enter the operand:");
		char op=sc.next().charAt(0);
		System.out.println("enter A and B");
		int b= sc.nextInt();
		int c=sc.nextInt();
		switch(op) {
		case '+':
			int a1=b+c;
			System.out.println(a1);
			break;
		
		case '-':
			int a2=b-c;
			System.out.println(a2);
			break;
		case '*':
			int a3=b*c;
			System.out.println(a3);
			break;
		case '/':
			int a4=b/c;
			System.out.println(a4);
			break;
		case '%':
			int a5=b%c;
			System.out.println(a5);
			break;
		}
		
	}

}
