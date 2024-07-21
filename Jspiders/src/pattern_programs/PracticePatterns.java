package pattern_programs;
import java.util.Scanner;
public class PracticePatterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(i==n||j==stars||j==1) {
					System.out.print("X");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			stars+=2;
		}
	}
}
