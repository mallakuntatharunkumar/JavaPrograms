package NestedForLoop;

public class B {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(i+" "+j);
				
				if(j%3==0) {
					break;
				}
					
			}
			System.out.println("-------------");
		}
	}

}
/*
1 1
1 2
1 3
-------------
2 1
2 2
2 3
-------------
3 1
3 2
3 3
-------------
4 1
4 2
4 3
-------------
5 1
5 2
5 3
-------------
*/