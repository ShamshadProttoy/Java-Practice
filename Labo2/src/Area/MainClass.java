
package Area;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("length of square: ");
        int len=input.nextInt();
         System.out.println("length of rect: ");
        int l=input.nextInt();
         System.out.println("width of rect: ");
        int w=input.nextInt();
        Area var=new Area();
        
        var.Area(len);
        var.Area(w, l);
    }
    
}
