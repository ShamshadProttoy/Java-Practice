
package anisulislam;

import java.util.Scanner;

public class sortingpractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=input.nextInt();
        }
        
        for(int i=0;i<4;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(arr[j]< arr[i])
            {
               int temp=arr[j];

                arr[j]=arr[i];
                arr[i]=temp;
            }
        }}
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
