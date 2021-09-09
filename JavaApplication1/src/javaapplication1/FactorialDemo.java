
package javaapplication1;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int result=factorial(n);
        System.out.println("the factorial of" + n + "is=" + result);
    }
    public static int factorial(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }
   
    
}
