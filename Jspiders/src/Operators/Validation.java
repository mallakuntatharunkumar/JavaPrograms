package Operators;

import java.util.*;

public class Validation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter UserName:");
        String userName = s.next();
        System.out.print("Enter Password:");
        String password = s.next();
        if (userName.equals("tharun")) {
            
            if (password.equals("Tharun#36")) 
            {
                System.out.println("Login Successful");
            } else {
                System.out.println("Password is wrong");
            }
        } else {
            System.out.println("Username is wrong");
        }

    }
}
