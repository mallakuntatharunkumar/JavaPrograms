package pattern_programs;
import java.util.*;

public class Com {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String s="";
        for(int i=A.length()-1;i>=0;i--){
            s+=A.charAt(i);
        } 
        System.out.println(s);
        if(s.equals(A)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}