package basics;
import java.util.*;
public class SwapWithOutThirdVariable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();//10
		int b=s.nextInt();//20
		a=a+b;//30
		b=a-b;
		a=a-b;
		System.out.println("After Swaping");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}

}
