package array;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int ar[] = { 43, 34, 4, 34, 1232, 43, 43, 4232, 2, 32, 32 };
		int s1=ar[0],s2=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(s1<ar[i]) {
				s2=s1;
				s1=ar[i];
				
			}
			else if(s2<ar[i]||s1==s2) {
				s2=ar[i];
			}
		}
		System.out.println(s2);
	}

}
