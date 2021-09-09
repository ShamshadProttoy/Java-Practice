
package toph;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Toph {
   

   
    public static void main(String[] args) {
        
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     NumberFormat format=NumberFormat.getNumberInstance();
     String s=format.format(n);
        System.out.println(s);
        
    }
    
}
