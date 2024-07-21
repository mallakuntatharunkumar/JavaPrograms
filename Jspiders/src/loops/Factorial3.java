package loops;
//5x4x3x2x1=
import java.util.*;
public class Factorial3 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the value:");
		int num=sc.nextInt();
		int product=1;
		String s ="";
		for(int i=num;i>=1;i--) {
			product*=i;
			s+=i;
			if(i>1) {
				s+="x";
			}
			
		}
		String s1=s+"="+product;
		System.out.println(s1);
		
	}
}
