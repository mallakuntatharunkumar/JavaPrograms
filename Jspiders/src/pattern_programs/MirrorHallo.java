package pattern_programs;

public class MirrorHallo {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i-1;j++) {
			System.out.print("  ");
		}
		for(int k=i;k<=5;k++) {
			if(k==i||i==1||k==5) {
				System.out.print("x ");
			}
			else {
				System.out.print("  ");
			}
		}
		
		
		System.out.println();
	}
}
}
