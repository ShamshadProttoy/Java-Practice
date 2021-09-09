
package hackerrranksolving;

import java.util.Scanner;


public class DemoStr {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char c=A.charAt(0);
        String A1=String.valueOf(c).toUpperCase();
        String A2=A.substring(1,A.length());
        String A3=A1.concat(A2);
        String B=sc.next();
        char c1=B.charAt(0);       

        String B1=B.substring(1);
        String B2=String.valueOf(c1).toUpperCase();
        String B3=B2.concat(B1);
        //System.out.println(A5);
        // System.out.println(A3+" "+B3);
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"YES":"NO");
         System.out.println(A3+" "+B3);
    }
}
