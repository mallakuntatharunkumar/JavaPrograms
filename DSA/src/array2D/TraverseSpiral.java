package array2D;

public class TraverseSpiral {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },

				{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		display(a);
	}
	static void display(int a[][]) {
		int len=a.length;
		int r=0;
		int c=-1;
		char d='r';
		for(int i=0;i<=len*len;i++) {
			if(d=='r') {
				c++;
				System.out.print(a[r][c]+" ");
				if(c==len-1-r)d='d';
			}
			else if(d=='d') {
				r++;
				System.out.print(a[r][c]+" ");
				if(r==c) d='l';
			}
			else if(d=='l') {
				c--;
				System.out.print(a[r][c]+" ");
				if(r+c==len-1) d='u';
			}
			else if(d=='u') {
				r--;
				System.out.print(a[r][c]+" ");
				if(r==c+1) d='r';
			}
		}
	}
}