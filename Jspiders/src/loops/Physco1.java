package loops;
import java.util.Scanner;
public class Physco1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int a = sc.nextInt();
		int r,sum=0,sum2=0;
		String s = "",s1="";
		while (a > 0) {
			r = a % 10;
			sum = sum + r;
			a = a / 10;
			s += r;
			if (a > 0) {
				s += "+";
			}
		}
		sum = sum + sum;
		System.out.println("(" + s + ")" + "+" + "(" + s + ")" + "=" + sum);
		while (sum > 0) {
			r = sum % 10;
			sum2 = sum2 + r;
			sum /= 10;
			s1 += r;
			if (sum > 0) {
				s1 += "+";
			}
		}
		System.out.println(s1 + "=" + sum2+"\nFinal Result:"+sum2);
	}
}
