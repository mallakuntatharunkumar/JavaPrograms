package loops;

import java.util.*;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		System.out.print("Enter the number:");
		int n = new Scanner(System.in).nextInt();
		int even=0,odd=0;
		for (int i = 1; i <= n; i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println(even+" "+odd);
	}
}
