
package statisticshelp;

import java.util.Scanner;

public class StatisticsHelp {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("total number:");
        int n=input.nextInt();
         int arr[]=new int[n];
         int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            
            sum=sum+arr[i];
        }
        System.out.println("SUMATION:"+sum);
         for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]< arr[i])
            {
               int temp=arr[j];

                arr[j]=arr[i];
                arr[i]=temp;
            }
        }}
         System.out.println("sorting in ascending order:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
