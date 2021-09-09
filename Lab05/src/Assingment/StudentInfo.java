
package Assingment;

import java.util.Scanner;
 class StudentInfo {
    
    String name;
    int id;
void display()
{ Scanner input=new Scanner(System.in);
    System.out.println("name of the student:");
    String Name=input.nextLine();
    System.out.println("id no:");
    int Id=input.nextInt();
    System.out.println("3quiz number:");
         Double q12=input.nextDouble();
    Double q22=input.nextDouble();
    Double q32=input.nextDouble();
    System.out.println("name :"+Name);
    System.out.println("id:"+Id);
     System.out.println("avarage="+(q12+q22+q32)/3);
}
}