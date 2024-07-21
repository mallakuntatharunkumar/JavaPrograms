package TypeCast;

import java.util.Scanner;

/* Write a program “PrintFriendsNames” that takes 3 friends’ names as input
arguments and prints out “Hi” to these friends in the reverse of the order given. It
also adds “and “ before the last name.

For example
Input Arguments : Mahesh, Suresh, Devesh
Output : “Hi Devesh, Suresh and Mahesh”

*/
public class PrintFriends {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[]=new String[3];
		for(int i=s.length-1;i>=0;i--) {
			System.out.print("Enter name:");
			String name=sc.nextLine();
			s[i]=name;
		}
		String str="";
		for(int i=0;i<s.length;i++) {
			if(i==0) {
				str+="Hi "+s[i]+",";
			}
			else if(i==1) {
				str+=s[1];
			}
			else {
				str+=" and "+s[2];
			}
		}
		System.out.println(str);
	}
	

}
