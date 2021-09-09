/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmdiu;

import java.util.Scanner;


public class EuclidAlgo {
    
    public static int gcd(int m,int n)
    {
        if(n==0)
        {
            return m;
        }
        return gcd(n,m%n);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(gcd(a,b));
       
    }
    
}
