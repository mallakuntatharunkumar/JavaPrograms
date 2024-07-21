package TypeCast;
import java.util.Scanner;
public class Game {
	static public void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("___GUESSING A NUMBER___"+"\n"+"Guess a numbers in 3 chances from 1-9");
		System.out.print("Enter player name:");
		String name=sc.nextLine();
		System.out.println("Hey!..hi "+name+" Are you ready");
		System.out.println("------------");
		int score = 0;
		int n = (int) ((Math.random() * 9) + 1);
		for (int i = 3; i >= 1; i--) {
			System.out.print("Guess Number:");
			int guess = sc.nextInt();
			if (n == guess) {
				System.out.println("Correct (:");
				score += 10;
				n = (int) ((Math.random() * 9) + 1);
			} else {
				System.out.print("Wrong ");
				System.out.println(i - 1 + " Chances left ):"+name);
			}
		}
		System.out.println("-------------------");
		System.out.println(name+" Total_Score:"+ score);
	}
}
