package ifstmt;
import java.util.*;
public class DaysCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Month number:");
		int m=sc.nextInt();
		int year = sc.nextInt();
		if(m==1||m==3||m==1||m==5||m==7||m==10||m==12) {
			System.out.println("31 Days");
		}
		else if(m==5||m==6||m==8||m==9||m==11) {
			System.out.println("30 days");
			
		}
		else if((year%400==0)||(year%4==0&& year%100!=0)) {
			System.out.println("29 days");
		}
		else {
			System.out.println("28 days");
		}
		
	}
}
