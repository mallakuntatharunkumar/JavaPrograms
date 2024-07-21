package leetcode;

public class LeetCode {

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[count]=nums[i];
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int newlen=removeElement(nums, val);
		for (int i=0;i<newlen;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
//5, nums = [0,1,4,0,3,_,_,_]


//package leetcode;
//
//public class LeetCode {
//
//	public static int removeElement(int[] nums, int val) {
//		int count = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != val) {
//				nums[count] = nums[i];
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
//		int val = 2;
//		int newLength = removeElement(nums, val);
//		System.out.println(newLength);
//		for (int i = 0; i < newLength; i++) {
//			System.out.print(nums[i] + " ");
//		}
//	}
//}
