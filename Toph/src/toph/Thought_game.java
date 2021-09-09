
package toph;

import java.util.Scanner;


public class Thought_game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcase=input.nextInt();
        while(testcase>0)
        
        {
            int a=input.nextInt();
            int b=input.nextInt();
             int result=(a+b)/2;
             if(result%2==0)
                 System.out.println("Sadia will be happy.");
             else
                 System.out.println("Oops!");
              testcase--;
                 
                 }    
        
    }
    
}
