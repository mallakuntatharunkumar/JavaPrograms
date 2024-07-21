package com;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Operation op = new Perform();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.addition\n2.Substraction\n3.Multiplication\n4.Division\n5.EXIT");
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter First number:");
				int x=sc.nextInt();
				System.out.print("Enter Second number:");
				int y=sc.nextInt();
				System.out.println("Sum:"+op.add(x, y));;
				break;
			case 2:
				System.out.println("Enter First number:");
				//int x1=sc.nextInt();
				System.out.println("Enter Second number:");
				//int y1=sc.nextInt();
				System.out.println("Sub:"+op.sub(sc.nextInt(),sc.nextInt()));
				break;
			case 3:
				System.out.println("Enter First number:");
				int x2=sc.nextInt();
				System.out.print("Enter Second number:");
				int y2=sc.nextInt();
				System.out.println("Multiplication:"+op.multi(x2, y2));;
				break;
			case 4:
				System.out.print("Enter First number:");
				int x3=sc.nextInt();
				System.out.print("Enter Second number:");
				int y3=sc.nextInt();
				System.out.println("Division:"+op.div(x3, y3));;
				break;	
			case 5:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.err.print("Invalid");
				
			}
			
			
		}
	}
}
