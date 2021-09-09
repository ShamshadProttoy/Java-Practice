
package hackerrranksolving;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String b="";
        for(int i=A.length()-1;i>=0;i--)
        {
           b =b+A.charAt(i);
        }
        if(b.equalsIgnoreCase(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
