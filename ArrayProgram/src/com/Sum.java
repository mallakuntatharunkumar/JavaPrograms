package com;
import java.util.*;
class Sum {
	   public static void main(String[] args){
	       Scanner s = new Scanner(System.in);
	       System.out.print("Size:");
	       int x=s.nextInt();
	       int[] arr = new int[x];

	       for(int k=0;k<arr.length;k++){
	    	   System.out.print("Value:");
	           int nums=s.nextInt();
	           arr[k]=nums;
	       }
	       for(int a=0;a<arr.length;a++) {
	    	   System.out.print(arr[a]+" ");
	       }
	       System.out.println();
	       System.out.println("Target:");
	       int target=s.nextInt();
	       
	       for(int i=0;i<arr.length;i++){
	           for(int j=0;j<arr.length;j++){
	               if(arr[i]+arr[j]==target){
	            	   System.out.println("["+i+","+j+"]"); 
	               }
	          
	               break;
	           }
	       }
	   }
	}