package array;

import java.util.Scanner;

public class Array6 {
public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] ar= new int[l];
        for(int i=0;i<ar.length;i++){
            int num=sc.nextInt();
            ar[i]=num;
        }
        
         int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        System.out.println(sum);
    }

}
