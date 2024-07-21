package array;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		int[] Arr= {0,50,3,2,5,2,7,2};
		int s1 = Arr[0];
		int s2=Arr[0];
		for(int i=1;i<Arr.length;i++) {
			if(s1==Arr[i]) {
				continue;
			}
			if(s1>Arr[i]) {
				s2=s1;
				s1=Arr[i];
			}
			else if(s2<Arr[i]||s1==s2) {
				s2=Arr[i];
			}
			System.out.println(s1+" "+s2);
		}
		
		System.out.println(s2);
	}

}
