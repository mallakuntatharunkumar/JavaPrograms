package loops;

public class BinarytoDecimPractice {
	public static void main(String[] args) {
		int n=1011;
		int i=1;
		int dec=0;
		while(n>0) {
			int r=n%10;
			dec=(r*i)+dec;
			i=i*2;
			n/=10;
		}
		System.out.println(dec);
	}

}
