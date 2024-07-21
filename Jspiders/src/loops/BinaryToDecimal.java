package loops;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int n=111000000;
		int i=1;//2//4//8//16
		int dec=0;
		while(n>0) {
			int r=n%10;//1//0//1
			dec=(r*i)+dec;//1//3//7//23
			i*=2;
			n/=10;
		}
		System.out.println(dec);
	}
}
