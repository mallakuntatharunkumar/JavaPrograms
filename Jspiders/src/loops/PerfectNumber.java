package loops;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter numbet to check it is Perfect number or not:");
		int n=sc.nextInt();
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;	
			}
		}
		String s=(n==sum)?"Perfect number":"Not Perfect number";
		System.out.println(s);
	}

}

/* input:6
	sum of the factors=1,2,3=6
	input == sum of Factors
	then it is a perfect number
*/