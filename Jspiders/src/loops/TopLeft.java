package loops;

public class TopLeft {
	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
				
			}
			for(int k=5;k<=5-i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
