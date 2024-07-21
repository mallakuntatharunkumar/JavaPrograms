package strings;

public class LargerstPalindrome {
	public static void main(String[] args) {
		String s="malayalaM";
		String bigpali="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalindrome(s,i,j)) {
					String s1=s.substring(i,j+1);
					if(s1.length()>bigpali.length()) {
						bigpali=s1;
					}
				}
			}
		}
		System.out.println("Big palindrome:"+bigpali);
	}
	static boolean isPalindrome(String s,int start,int end){
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;j--;
		}
		return true;
		
	}

}
