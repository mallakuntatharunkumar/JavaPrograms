package array3D;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 3, 5, 1, 6, 9};
        int[] sortedArray = sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println(sortedArray[1]);
    }

    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
