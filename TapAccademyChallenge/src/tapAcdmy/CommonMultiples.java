package tapAcdmy;
import java.util.*;
public class CommonMultiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1:");
		int n1=sc.nextInt();
		System.out.println("enter n2:");
		int n2=sc.nextInt();
		System.out.println("enter y:");
		int y =sc.nextInt();
		
		int count=0;
		int i=1;
		while(count<y) {
			int mul=n1*i;
			if(mul%n2==0) {
				System.out.println(mul);
				count++;
			}
			i++;
		}
		
	}
}
