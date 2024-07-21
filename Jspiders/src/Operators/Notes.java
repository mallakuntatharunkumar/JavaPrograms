package Operators;

import java.util.*;

public class Notes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of money: ");
		int money = sc.nextInt();
		int originalAmount = money;
		int fiveHundredNotes = money / 500;
		money %= 500;
		int twoHundredNotes = money / 200;
		money %= 200;
		int hundredNotes = money / 100;
		money %= 100;
		int fiftyNotes = money / 50;
		money %= 50;
		int twentyNotes = money / 20;
		money %= 20;
		int tenNotes = money / 10;
		money %= 10;
		int fiveNotes = money / 5;
		money %= 5;
		int twoNotes = money / 2;
		money %= 2;
		int oneNotes = money;
		System.out.println("For the amount " + originalAmount);
		System.out.println("500: " + fiveHundredNotes);
		System.out.println("200: " + twoHundredNotes);
		System.out.println("100: " + hundredNotes);
		System.out.println("50: " + fiftyNotes);
		System.out.println("20: " + twentyNotes);
		System.out.println("10: " + tenNotes);
		System.out.println("5: " + fiveNotes);
		System.out.println("2: " + twoNotes);
		System.out.println("1: " + oneNotes);
	}
}
