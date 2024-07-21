package methods;
import java.util.Scanner;
public class ArmStrongMethods {
	public static void main(String... args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter range:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		displayArmStrong(a,b);	
	}
	static void displayArmStrong(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isArmStrong(i)) {
				System.out.println(i);
			}
		}	
	}
	
	//the armstrong logics are done here
	static Boolean isArmStrong(int a) {
		int count=length(a);
		int n=a;
		int sum = 0;
		while(a>0) {
			sum+=(int)Math.pow(a%10, count);
			a/=10;
		}
		return sum==n;
	}
	
	//Finding how many digits are in the input
	static int length(int count) {
		int c=0;
		while(count>0) {
			
			c++;
			count/=10;
		}
		return c;
	}
	
	
}
