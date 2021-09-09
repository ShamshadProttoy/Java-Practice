
package toph;

import java.util.Scanner;


public class Numberformation01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int n=input.nextInt();
     char str[]=new char[50];
      int j=0,k=0;
      String s=String.valueOf(n);
      int l=s.length();
      for(int i=l-1;i>=0;i--)
      {
        
          if(j==3)
          {
              str[k++]=',';
              str[k++]=s.charAt(i);
              j=1;
          }
          else
          {
              str[k++] =s.charAt(i);
          j++;
          }
          
      }
       
       for(int t=k-1;t>=0;t--)
       {
           System.out.print(str[t]);
       }
    }
    
}
