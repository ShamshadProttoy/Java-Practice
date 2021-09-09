
package hackerrranksolving;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
       // System.out.println(x + " can be fitted in:");
        for(int i=0;i<t;i++)
        {
            try{
            long x=input.nextLong();
            System.out.println(x + " can be fitted in:");
            if(x>=-128&&x<=127)
                System.out.println("* byte");
            if(x>=-(Math.pow(2.0, 16-1))&&x<=(Math.pow(2.0, 16-1)-1))
                 System.out.println("* short");
            if(x>=-(Math.pow(2.0, 32-1))&&x<=(Math.pow(2.0, 32-1)-1))
                 System.out.println("* int");
            if(x>=-(Math.pow(2.0, 64-1))&&x<=(Math.pow(2.0, 64-1)-1))
                 System.out.println("* long");
            }catch(Exception e){
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
        }
        input.close();
    }
    
}