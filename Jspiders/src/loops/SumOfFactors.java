package loops;
import java.util.*;
public class SumOfFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;	
				System.out.println(i);
			}
		}
		System.out.println("-----------------");
		System.out.println(sum);
	}

}
