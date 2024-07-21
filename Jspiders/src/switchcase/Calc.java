package switchcase;
import java.util.*;
public class Calc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition\n2.substraction\n3.multiplication\n4.Division\n5.Modulodivision");
		char op=sc.next().charAt(0);
		System.out.println("Enter A and B");
		int b= sc.nextInt();
		int c=sc.nextInt();
		switch(op) {
		case '1':
			int a1=b+c;
			System.out.println(a1);
			break;
		
		case '2':
			int a2=b-c;
			System.out.println(a2);
			break;
		case '3':
			int a3=b*c;
			System.out.println(a3);
			break;
		case '4':
			int a4=b/c;
			System.out.println(a4);
			break;
		case '5':
			int a5=b%c;
			System.out.println(a5);
			break;
		}
		
	}

}
