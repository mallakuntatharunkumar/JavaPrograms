package ud;
import java.util.Scanner;
public class PoNeg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many number do u want to check:");
		int n = s.nextInt();

		
		for (int i=1;i<=10;i++) {
			
			System.out.print("Enter number to check:");
			int x=s.nextInt();
			if (x>0) {
				System.out.println(x+" is Poistive number");
			}
			else if(x<0) {
				System.out.println(x+" is negetive number");
			}
			else {
				System.out.println("Zero");
			}
		}
		
	}
}


//10hours
