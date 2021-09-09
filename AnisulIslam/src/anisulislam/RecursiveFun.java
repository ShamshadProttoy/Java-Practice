
package anisulislam;

import java.util.Scanner;

public class RecursiveFun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int result=1;
        for(int i=1;i<num;i++)
        {
            result=result*i;
        }
        System.out.println(result);
    }
    
}
