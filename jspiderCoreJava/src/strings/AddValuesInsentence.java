package strings;

public class AddValuesInsentence {
	public static void main(String[] args) {
		String s="java143 is3";
		int rev=0;
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				rev=rev*10+s.charAt(i)-'0';
			}
			else {
				sum+=rev;
				rev=0;
			}
			if(i==s.length()-1) {
				sum+=rev;
			}
		}
		System.out.println(sum);
		
		
	}

}
