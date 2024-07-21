package RangetoRange;
import java.util.Scanner;
public class SecondSmallPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i, j;
		int num = 0;
		int count=0;
	
		for (i = start; i <= end; i++) {
			
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				count++;
				if(count==2) {
					System.out.println(i);
					break;
				}
					
			}
			
		}
		//System.out.println("Greatest:" + num);

	}

}
