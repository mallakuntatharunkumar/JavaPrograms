package tapAcdmy;
import java.util.Scanner;
public class SortFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter tagert number");
		int target = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				System.out.println("Element found at Index " + i);
				break;
			}

		}
		

	}

}
