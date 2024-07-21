package loops;
import java.util.*;
public class SumOfNNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		String s ="";
		for(int i=1;i<=n;i++) {
			sum+=i;
			s+=i;
			if(i<n) {
				s+="+";
			}
		}
		s+="=";
		System.out.println(s+(sum));
		
		
	}

}
