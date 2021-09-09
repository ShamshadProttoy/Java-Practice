
package toph;

import java.util.Scanner;


public class Set_Union {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);    
    int a=input.nextInt();
    int b=input.nextInt();
    int arr[]=new int[a];
    int brr[]=new int[b];
   int len=a+b;
   int temp,k=0;
   int i,j=0;
    
    for( i=0;i<a;i++)
    {
        arr[i]=input.nextInt();
    }
    for( i=0;i<b;i++)
    {
        brr[i]=input.nextInt();
    }
    int crr[]=new int[len];
   for( i=0;i<a;i++)
   {
       crr[j++]=arr[i];
   }
    for( i=0;i<b;i++)
   {
       crr[j++]=brr[i];
   }
    
      for( i=0;i<len;i++)
      {
          for( j=i+1;j<len;j++)
          {
              if(crr[i]>crr[j])
              {
                  temp=crr[i];
                  crr[i]=crr[j];
                  crr[j]=temp;
              }
          }
      }
    for( i=0;i<len;i++)
    {
        for( j=i+1;j<len;)
        {
            if(crr[i]==crr[j])
            {
                for( k=j;k<len;k++)
                {
                    crr[k]=crr[k+1];
                    
                    
                }
                len--;
                
                
            }
            else
            {
                j++;
            }
        }
    }
    for( int f:crr)
    {
        System.out.println(f);
    }
            
    
    
    }
    
}
