package array2D;

import java.io.*;

//Main class

class Ne {


 // Main driver method

 public static void main(String[] args)

 {

     // Declaring and initializing variable to

     // Size of the pyramid

     int number = 5;


     int i = number, j;


     // Nested while loops

     // Outer loop


     // Till condition holds true

     while (i > 0) {

         j = 0;


         // Inner loop

         // Condition check

         while (j++ < number - i) {

             // Print whitespaces

             System.out.print(" ");

         }


         j = 0;


         // Inner loop

         // Condition check

         while (j++ < (i * 2) - 1) {

             // Print star

             System.out.print("*");

         }


         // By now, we reach end of execution for one row

         // so next line

         System.out.println();


         // Decrementing counter because we want to print

         // reverse of pyramid

         i--;

     }

 }
}