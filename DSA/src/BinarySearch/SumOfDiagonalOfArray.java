package BinarySearch;
//0,0  1,1  2,2
public class SumOfDiagonalOfArray {
	public static void main(String[] args) {
		int[][] array= {{1,2,3},
						{4,5,6},
						{6,7,8}};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			
				sum+=array[i][i];
			
		}
		System.out.println(sum);
		
	}
	

}
