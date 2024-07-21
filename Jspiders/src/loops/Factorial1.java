package loops;
import java.util.*;
public class Factorial1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find Factorial:");
		int n=sc.nextInt();
		int product=1;
		for(int i=1;i<=n;i++) {
			product=product*i;
		}
		System.out.println(product);
	}

}
