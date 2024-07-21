package array;

public class Array3 {
	public static void main(String[] args) {
		int [] n={1,2,0,3,0,1,2};
		int [] a=new int[n.length];
		int count=n.length-1;
		for(int i=n.length-1;i>=0;i--) {
			
			if(n[i]!=0) {
				a[count]=n[i];
				count--;
			}
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		
	}
}
