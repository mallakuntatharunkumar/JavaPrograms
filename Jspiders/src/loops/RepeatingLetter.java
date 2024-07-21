package loops;

public class RepeatingLetter {
	public static void main(String[] args) {
		String s="abcabcabc";
		char s1 ,s2;
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			s1=s.charAt(i);
			for(int j=0;j<=s.length()-1;j++) {
				s2=s.charAt(j);
				
				if(s1==s2) {
					count++;
	
				}
				
			}
			System.out.println(s1+":"+count);
			count=0;
		}
	}

}
