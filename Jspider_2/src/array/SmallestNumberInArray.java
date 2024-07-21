package array;

public class SmallestNumberInArray {
	public static void main(String[] args) {
		int[] array= {4,23,6,3,2};
		int small=array[0];
		for(int i=1;i<array.length;i++) {
			if(small>array[i]) {
				small=array[i];
			}
			System.out.println(small+":Small");
		}
		System.out.println(small);
	}

}
