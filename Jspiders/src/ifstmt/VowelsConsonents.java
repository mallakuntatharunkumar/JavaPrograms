package ifstmt;
import java.util.*;
public class VowelsConsonents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter:");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c+" is a Vowel");
		}
		else {
			System.out.println(c+" is a consonent");
		}
	}

}
