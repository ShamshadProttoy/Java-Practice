
package hackerrranksolving;

import java.util.Scanner;

public class PrintfFormatter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double d=input.nextDouble();
        input.nextLine();
        String s=input.nextLine();
        System.out.printf("%-7s%07.2f",s,d);
    }
    
}
