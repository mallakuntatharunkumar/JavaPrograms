package tapAcdmy;

import java.util.Scanner;

public class VoteEligibility {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int age=sc.nextInt();
	String card=sc.next();
	if(age>=18) {
		if(card.equals("Yes")) {
		System.out.println("Eligible to Apply");
		}
		else {
			System.out.println("Get a Voter ID");
		}
	}
	else {
		System.out.println("Not Eligible to Apply");
	}
}
}
