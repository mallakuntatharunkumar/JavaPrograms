package array;

public class SecondLargestNumberInArray {
	public static void main(String[] args) {
		int[] a= {9,4,5,3,2,7,0,2};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++) {
//			if(s1==a[i]) {
//				continue;
//			}
			if(s1<a[i]) {
				s2=s1;
				s1=a[i];
			}
			else if(s2<a[i]||s1==s2) {
				s2=a[i];
			}
		}
		System.out.println(s2);
		
	}

}
