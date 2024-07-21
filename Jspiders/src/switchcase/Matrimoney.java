package switchcase;
/*
char m,f
m-age-25-35
	salary>80000
f-age>18
	salary>=0
*/
import java.util.*;

public class Matrimoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gender:");
		char gender = sc.next().charAt(0);
		switch (gender) {
		case 'm':
			System.out.print("Enter age:");
			int age = sc.nextInt();
			if (age >= 25 && age <= 35) {
				System.out.println("Enter salary:");
				int salary = sc.nextInt();
				if (salary >= 80000) {
					System.out.println("Ready to marry");
				} else {
					System.out.println("Improve your salary");
				}
			} else {
				System.out.println("age not matched");
			}
			break;
		case 'f':
			System.out.print("Enter age:");
			int age_f = sc.nextInt();
			if (age_f >= 18) {
				System.out.print("Enter salary:");
				int salary = sc.nextInt();
				if (salary >= 0) {
					System.out.println("Ready to marry");
				} else {
					System.out.println("Improve your salary");
				}
			} else {
				System.out.println("Age is not matched");
			}
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
