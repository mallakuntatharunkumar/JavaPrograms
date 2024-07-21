package loops;
import java.util.*;
public class Factorial2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial:");
		int n = sc.nextInt();
		int pro=1;
		String s="";
		for(int i=1;i<=n;i++) {
			pro*=i;
			s+=i;
			if(i<n) {
				s+="*";
			}
		}
		System.out.println(s+"="+pro);
	}

}
