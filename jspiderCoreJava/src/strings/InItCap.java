package strings;

public class InItCap {
	public static void main(String[] args) {
		String s="tharun kumar";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
//			System.out.println(c[i]);
	
			if(i==0||ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z') {
					ch[i]= (char)(ch[i]-32);
				}
				
			}
			
		}
		System.out.println(ch);
	}
}
