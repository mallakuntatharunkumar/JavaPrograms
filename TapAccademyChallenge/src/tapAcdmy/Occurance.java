package tapAcdmy;

public class Occurance {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 3, 5, 5, 5};
        int current = array[0];//1
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == current)
            {
                count++;
            } 
            else
            {
                System.out.println(current + "-" + count);
                current = array[i];
                count = 1;
            }
        }
    
        
        System.out.println(current + "-" + count);
    }
}