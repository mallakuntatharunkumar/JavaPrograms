package strings;
public class AlphaBetsAssending {
	public static void main(String[] args) {
		String s="zbcdefghijklmnopqurstuvwxya";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length-1;j++) {
				if(c[j]>c[j+1]) {
					int temp=c[j];
					c[j]=c[j+1];
					c[j+1]=(char) temp;
				}
			}
		}
		System.out.println(c);
	}
}
