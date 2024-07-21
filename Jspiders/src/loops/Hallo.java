package loops;
import java.util.*;
public class Hallo {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the range:");
		int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || i==1||j==0||j==n-1||i==n-1||i==n ||j==1||j==n) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
