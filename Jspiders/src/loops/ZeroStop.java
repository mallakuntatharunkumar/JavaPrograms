package loops;
import java.util.*;
public class ZeroStop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			int n  = sc.nextInt();
			if(n==0) {
				break;
			}
			else {
				sum+=n;
			}
		}
System.out.println(sum);
		
	}
}
