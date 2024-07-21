package Operators;
import java.util.*;
public class Notes2 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount:");
		int mon=sc.nextInt();
		System.out.println("Amount:"+mon);
		int fiveHundrad=mon/500;
		mon=mon%500;
		System.out.println("500:"+fiveHundrad);
		
		int twoHundrad=mon/200;
		mon=mon%200;
		System.out.println("200:"+twoHundrad);
		
		int Hundrad=mon/100;
		mon=mon%100;
		System.out.println("100:"+Hundrad);
		
		int fifty=mon/50;
		mon=mon%50;
		System.out.println("50:"+fifty);
		
		int twenty=mon/20;
		mon=mon%20;
		System.out.println("20:"+twenty);
		
		int ten=mon/10;
		mon=mon%10;
		System.out.println("10:"+ten);
		
		int five=mon/5;
		mon=mon%5;
		System.out.println("5:"+five);
		
		int two=mon/2;
		mon=mon%2;
		System.out.println("2:"+five);
		
		int one=mon/1;
		//mon=mon%1;
		System.out.println("1:"+five);
		
		
	 }

}
