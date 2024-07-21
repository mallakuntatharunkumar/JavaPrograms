package tapAcdmy;

import java.util.Scanner;

/*
 Write a program CheckTheSeason if the month number is entered. In this program
check needs to be done if the month number is correct data type and numbers are
between 1 to 12. If not, the program should throw an error and should continue till it
is not correctly entered.

Following table indicates Month numbers and seasons:
2 & 3 : Vasanta
4 & 5: Grishma / Summer
6 & 7: Monsoon / Rainy
8 & 9: Sharada
10 & 11: Hemanta
12 & 1 : Shishira / Winter
12 & 1 : Winter
 */
public class CheckTheSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();

		switch (num) {
		case 1:
		case 12:
			System.out.println("Shishira/Winter");
			break;
		case 2:
		case 3:
			System.out.println("Vasanta");
			break;
		case 4:
		case 5:
			System.out.println("Grishma / Summer");
			break;
		case 6:
		case 7:
			System.out.println("Monsoon / Rainy");
			break;
		case 8:
		case 9:
			System.out.println("Sharada");
			break;
		case 10:
		case 11:
			System.out.println("Hemanta");
			break;
		default:
			System.out.println("Enter valid number");

		}

	}
}
