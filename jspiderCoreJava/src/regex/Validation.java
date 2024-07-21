package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numexp = "[9876][0-9]{9}";
		System.out.print("Enter Mobile Number:");
		String number = sc.nextLine();
		Pattern p1 = Pattern.compile(numexp);
		Matcher m1 = p1.matcher(number);
		if (!(m1.matches())) {
			System.out.println("Enter valid number");
		}
		String gmailemp = "[a-z][a-z 0-9]+@[ge]mail[.]com";
		System.out.print("Enter Gmail:");
		String Gamil = sc.nextLine();
		Pattern p2 = Pattern.compile(gmailemp);
		Matcher m2 = p2.matcher(Gamil);
		if (!(m2.matches()))
			System.out.println("Enter valid Gmail");
		String Passwordexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[?/.!@#$%^&*()]).{6,}";
		System.out.print("Enter Passsword:");
		String Password = sc.nextLine();
		Pattern p3 = Pattern.compile(Passwordexp);
		Matcher m3 = p3.matcher(Password);
		if (!(m3.matches()))
			System.out.println("Enter valid Password");
		if (m1.matches() && m2.matches() && m3.matches()) {
			System.out.print("Confirm Password:");
			String rePassword = sc.nextLine();
			if (Password.equals(rePassword)) {
				System.out.println("---Login Successfull (:---");
			} else {
				System.out.println("Password is not matched");
			}
		} else {
			System.out.println("---Login Un-Successfull ):---");
		}

	}

}
/*
 Enter Mobile Number:9542243682 
 Enter Gmail:tharunroyals46@gmail.com
 Enter Passsword:Tharun#46
 Confirm Password:Tharun#46 
 ---Login Successfull (:---
 */