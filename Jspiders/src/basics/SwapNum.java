package basics;
import java.util.*;
public class SwapNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
}


/*
 
 public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		System.out.println(c);
	}
 
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The local variable c may not have been initialized

	at Jspiders/basics.SwapNum.main(SwapNum.java:8)
	*/
 