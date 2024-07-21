package array;

public class Array4 {
	public static void main(String[] args) {
		int[] n= {17,28,31,46,52,67,72,81,90,56};
		
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				System.out.print(n[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<n.length;i++) {
			if(n[i]%2!=0) {
				System.out.print(n[i]+" ");
			}
		}
		
	}

}
