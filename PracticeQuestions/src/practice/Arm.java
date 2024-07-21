package practice;

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Number:");
        int start = sc.nextInt();
        System.out.print("Enter End Number:");
        int end = sc.nextInt();
        int count = 3;

        for (int n = start; n <= end; n++) {
            int number = n;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                int prod = 1;
                for (int i = 0; i < count; i++) {
                    prod *= digit;
                }
                sum += prod;
                number /= 10;
            }

            if (sum == n) {
                System.out.println(n + " is an Armstrong number.");
            }
        }
    }
}
