
package Assingment;

import java.util.Scanner;




public class main {
    public static void main(String[] args) {
        
    
   Scanner input=new Scanner(System.in);
        System.out.println("number of students:");
        int num=input.nextInt();
        StudentInfo[] s=new StudentInfo[num];
        for(int i=0;i<num;i++)
        {
            s[i]=new StudentInfo();
            s[i].display();
        }
   
  
}}
