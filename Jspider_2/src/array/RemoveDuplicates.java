package array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] n = { 1, 2, 0, 3, 0, 4, 2, 5 };
        int[] n1 = new int[n.length];
        int len = 0;

        for (int i = 0; i < n.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < len; j++) {
                if (n[i] == n1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                n1[len] = n[i];
                len++;
            }
        }

        // Print the unique elements
        for (int i = 0; i < len; i++) {
            System.out.print(n1[i]+ " ");
        }
    }
}
