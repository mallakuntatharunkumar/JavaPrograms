	package loops;
import java.util.*;
public class HappySad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		do {
		while(n>0) {
			int r=n%10;
			int sq=r*r;
			sum+=sq;
			n/=10;
		}
		n=sum;
		sum=0;
	}while(n>9);
		
		if(n==1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Sad number");
		}

}
	}
/* input:49=>4sq+9sq=16+81=97 =>9sq+7sq=81+49=130=1sq+3sq+0sq=1+9+0=10=>1sq+0sq=1
Happy number
*/