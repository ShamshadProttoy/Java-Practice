
package toph;

import java.util.Scanner;

public class Running_average {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double count=1,sum=0;
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=input.nextInt();
           sum=sum+arr[i];
           double avg=sum/count;
            System.out.printf("%.4f\n",avg);
           count++;
           
        }
         
    }
    
}
