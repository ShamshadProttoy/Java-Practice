
package hackerrranksolving;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=input.nextInt();
            int b=input.nextInt();
            int n=input.nextInt();
            
            int temp=a;
            for(int j=0;j<n;j++)
            {
                temp= (int) (temp+(Math.pow(2.0,j)*b));
                System.out.print(temp+" ");
            }
            System.out.println();
        }
        input.close();
    }
    
}
