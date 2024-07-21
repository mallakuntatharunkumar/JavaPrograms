package NestedForLoop;

public class C {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					System.out.println(i+" "+j);
					if(j%3==0) {
						break;
					}
					
				}
				if(i%3==0) {
					break;
				}
		}
	}
}
/*1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
*/