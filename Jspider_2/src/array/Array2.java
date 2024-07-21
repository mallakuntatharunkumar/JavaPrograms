package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int [] n={1,2,0,3,0,1,2};
			Arrays.sort(n);
			int rd=0;
			for(int i=1;i<n.length;i++) {
				if(n[rd]!=n[i]) {
					rd++;
					n[rd]=n[i];
				}
			}
			for(int i=0;i<=rd;i++) {
				System.out.print(n[i]+" ");
			}
		
			System.out.println();
		
		
		
		
		
			
			
			
			
		
		
		
		
		
//		for(int i=0;i<n.length;i++) {
//			for(int j=i+1;j<n.length;j++) {
//				if(n[i]>n[j]) {
//					int temp=n[i];
//					n[i]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
		
		for(int ar:n) {
		System.out.print(ar+" ");
		}
	}

}
