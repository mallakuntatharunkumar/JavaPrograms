package strings;
//java22 is3 45easy
// o/p:22+3+45=70
public class AddNumberInAStrings {
	public static void main(String[] args) {
		String s="Java22 is3 45easy9";
		char[] ch=s.toCharArray();
		int sum=0;
		int rev=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&c<='9') {
				rev=rev*10+c-'0';
			}
			else {
				System.out.println(rev+" "+sum);
				sum+=rev;
				rev=0;
			}
			if(i==ch.length-1) {
				sum+=rev;
			}
		}
		System.out.println("Final Sum"+sum);
		
	}
}
