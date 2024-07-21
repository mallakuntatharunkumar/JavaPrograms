package pattern_programs;

public class M_Pattern {

	public static void main(String[] args) {
		int n = 7; // You can change the height as needed

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				// Print "*" at the beginning, at the end, and for the middle diagonal lines
				//if (j == 0 || j == height || (i == j && j <= height / 2) || (j == height - i && j > height / 2)) 
				if(j==0||j==n||(i==j&&i<=n/2)||(j==n-i&&j>n/2))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
