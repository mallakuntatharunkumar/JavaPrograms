package loops;
import java.util.*;
public class fibanoci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		for(int i =1;i<=n;i++) {
			System.out.println(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
	}

}
