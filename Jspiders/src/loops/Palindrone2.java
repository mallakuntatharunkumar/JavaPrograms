package loops;
import java.util.*;
public class Palindrone2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        while (a != 0) {
            int b = a % 10;
            a /= 10;
            s += b;
        }
        System.out.println(s);
        
    }
}
