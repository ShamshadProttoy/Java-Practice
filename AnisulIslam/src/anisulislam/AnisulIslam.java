
package anisulislam;

import java.util.Scanner;


public class AnisulIslam {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type the temperature in celcius:");
        double c;
        c = input.nextDouble();
        
        double f;
        f = c*(9.0/5)+32;
        System.out.println("conversion"+f);
        
       
    
    }
    
}
