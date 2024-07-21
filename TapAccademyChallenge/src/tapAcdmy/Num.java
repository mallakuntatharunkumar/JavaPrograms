package tapAcdmy;
import java.util.*;
public class Num {
	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	            
	            int sum=0+t;
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            sum=sum+i*b; 
	        }
	        System.out.print(sum);
	        in.close();
	    }
	}

