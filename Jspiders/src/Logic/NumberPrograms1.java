package Logic;

import java.util.Scanner;

//Even and odd sum.....
public class NumberPrograms1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range:");
		int n=sc.nextInt();//to take dyanamic input from the user
		
		int evenSum=0;//declaring for add even numbers sum..ok
		int oddSum=0;//for odd sum..ok
		//now loop
		//n is dynamic input will store in the loop 
		//osey navvinchaku 
		for(int i=1;i<=n;i++) {	
			if(i%2==0) {//seee edhe i%2==0 and   every iteration lo i increment avvudhhe kadha
				evenSum=evenSum+i;//for adding purpose....ekkada even number anni sum avuthai
			}
			else {
				oddSum=oddSum+i;// ikkada odd number add avuthai..done aa
			}
			
		}
		//now eppudu print cheddhamaaa even sum and odd sum?
		//now
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
//chusthannava
//2+4+6+8+10=30....even number ne add chesam
//1+3+5+7+9=25.....odd number ne add chesam
//Artham iyyendha ?
//seee