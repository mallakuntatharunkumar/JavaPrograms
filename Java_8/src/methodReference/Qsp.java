package methodReference;

import java.util.Scanner;

public class Qsp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0;
		int fact=1;
		for(int i=0;i<n;i++) {
			if(i==0) {sum+=1; continue;  }
			for(int j=1;j<=i;j++) {
				fact*=j;
			}
			System.out.println(i+"="+fact);
			sum+=fact;
			fact=1;
		}
		System.out.println(sum*2);
	}

}

//725760
