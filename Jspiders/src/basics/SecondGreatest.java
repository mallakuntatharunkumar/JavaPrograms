package basics;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        
        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);         
        int secondLargest = (a == largest) ? (b > c ? b : c) : (b == largest) ? (a > c ? a : c) : (a > b ? a : b);
        
        System.out.println("The second largest number among " + a + ", " + b + ", and " + c + " is: " + secondLargest);
        
        sc.close();
    }
}

