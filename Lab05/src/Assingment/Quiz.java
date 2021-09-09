
package Assingment;

import java.util.Scanner;

 class Quiz extends StudentInfo {
     Double q1;
     Double q2;
     Double q3;
     
    
 
     void display1()
     {
         Scanner input=new Scanner(System.in);
         System.out.println("3quiz number:");
         Double q12=input.nextDouble();
    Double q22=input.nextDouble();
    Double q32=input.nextDouble();
         super.display();
         System.out.println("avarage="+(q12+q22+q32)/3);
         
     }
    
    
}
