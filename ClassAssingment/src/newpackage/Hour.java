
package newpackage;

import java.util.Scanner;


public class Hour {
    

    
    public static void main(String[] args) {
        int sec,hour,min;
        Scanner scan = new Scanner(System.in);
        sec = scan.nextInt();
        hour = (sec/360);
        sec = (sec%3600);
        min = (sec/60);
        sec = (sec%60);
        System.out.print(""+hour);
        System.out.print(":"+min);
        System.out.println(":"+sec);
        
    }
    
}

    

