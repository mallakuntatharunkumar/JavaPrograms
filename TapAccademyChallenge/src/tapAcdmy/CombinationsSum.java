package tapAcdmy;

public class CombinationsSum {
	public static void main(String[] args) {

		int[] arr = { 3, 7, 5, 2, 1, 9, 6, 4 };
		int sum = 0;
		
		int min_value=0;
		int max_value=0;
		for(int i=0;i<arr.length;i++) {
			min_value+=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("skipped:"+arr[i]);
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					
					continue;
				}
				sum += arr[j];
				System.out.print(arr[j]+" ");
			}
			if(sum>max_value) {
				max_value=sum;
			}
			else if(sum<min_value) {
				min_value=sum;
			}
			System.out.println(":"+sum);
			sum = 0;
		}
		System.out.println(min_value+" "+max_value);

	}
}
