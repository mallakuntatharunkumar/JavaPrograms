package array2D;

import java.util.Arrays;

public class AddElementsInSpiral {


	public static void main(String[] args) {
		int[][] a = new int[5][5];
		display(a);
		for(int[] row:a) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
//		System.out.println(Arrays.toString(a));
	}
	static void display(int a[][]) {
		int len=a.length;
		int r=0;
		int c=-1;
		char d='r';
		for(int i=1;i<=len*len;i++) {
			
			if(d=='r') {
				c++;
				a[r][c]=i;
				if(c==len-1-r)d='d';
			}
			else if(d=='d') {
				r++;
				a[r][c]=i;
				if(r==c) d='l';
			}
			else if(d=='l') {
				c--;
				a[r][c]=i;
				if(r+c==len-1) d='u';
			}
			else if(d=='u') {
				r--;
				a[r][c]=i;
				if(r==c+1) d='r';
			}
		}
	}
}