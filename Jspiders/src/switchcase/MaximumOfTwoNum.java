package switchcase;
import java.util.*;
public class MaximumOfTwoNum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Value of A:");
		int a=sc.nextInt();
		System.out.print("Enter Value of B:");
		int b=sc.nextInt();
		int c=a>b?1:0;
		switch(c) {
		case 1:
			System.out.println(a+" is greater");
			break;
		case 0:
			c=a<b?1:0;
			switch(c) {
			case 1:
				System.out.println(b+" is greater");
				break;
			case 2:
				System.out.println("Both are Equal");
				break;
			}
		
		}
		
		
	}

}
