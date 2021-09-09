
package toph;

import java.util.Scanner;

public class imcopatible_crops01 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
    
        int n=input.nextInt();
        int m=input.nextInt();
        char[][] s=new char[n][m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                s[i][j]=input.next().charAt(0);
            }
        }
        try{
        for(int i=0;i<n;i++)
   {
       for(int j=0;j<m;j++)
       {
           if(i==0&&j==0)
           {
               if(s[i][j]=='.'&&s[i][j+1]!='*'&&s[i+1][j]!='*')
                c++;
           }
           else if(j==0)
           {
               if(s[i][j]=='.'&&s[i][j+1]!='*'&&s[i+1][j]!='*'&&s[i-1][j]!='*')
                c++;
           }
           else if(j==m-1)
           {
               if(s[i][j]=='.'&&s[i][j-1]!='*'&&s[i+1][j]!='*'&&s[i-1][j]!='*')
                c++;
           }
           else if(i==0&&j==m-1)
           {
               if(s[i][j]=='.'&&s[i][j-1]!='*'&&s[i+1][j]!='*')
                c++;
           }
           else if(i==n-1&&j==0)
           {
               if(s[i][j]=='.'&&s[i][j+1]!='*'&&s[i-1][j]!='*')
                c++;
           }
           else if(i==n-1&&j==m-1)
           {
               if(s[i][j]=='.'&&s[i][j-1]!='*'&&s[i-1][j]!='*')
                c++;
           }
           else
           {
               if(s[i][j]=='.')
           {
             if(s[i][j+1]!='*'&&s[i][j-1]!='*'&&s[i-1][j]!='*'&&s[i+1][j]!='*')
                c++;
           }
           }

       }
   }
    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(c);
    }}
