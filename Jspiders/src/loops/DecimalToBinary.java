package loops;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 420;
		int i = 1;
		int binary = 0;
		while (n > 0) {
			int r = n % 2;
			binary = (r * i) + binary;
			i *= 10;
			n /= 2;
		}
		System.out.println(binary);
	}
}
