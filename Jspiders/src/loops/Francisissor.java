package loops;

public class Francisissor {
	public static void main(String[] args) {
		int n = 9525;
		int temp = n;
		int r, mul;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			mul = r * r;
			sum += mul;
			n /= 10;
		}
		System.out.println(sum);
	}
}
//9^2+----5^2=?