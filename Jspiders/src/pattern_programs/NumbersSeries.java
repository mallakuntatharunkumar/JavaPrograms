package pattern_programs;

import java.util.Scanner;

public class NumbersSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int num=((i-1)*n)+1;
				for(int j=1;j<=n;j++) {
					System.out.print(num+"\t");
					num++;
				}
			}
			else {
				int num=i*n;
				for(int j=1;j<=n;j++) {
					System.out.print(num+"\t");
					num--;
				}
			}
			System.out.println();
			
		}
	}

}
