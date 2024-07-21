package ifstmt;
import java.util.*;
public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age:");
		int age = sc.nextInt();
		
		if(age>=25 && age<=35) {
			System.out.print("enter salary:");
			int salary=sc.nextInt();
			if(salary>=80000) {
				System.out.println("Ready to marriage");
			}
			else {
				System.out.println("improve salary");
			}
			
		}
		else {
			System.out.println("Not reached correct age");
		}
	}
}
