
package toph;

import java.util.Scanner;


public class incpmpatible_crops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    
        int r=input.nextInt();
        int c=input.nextInt();
        char[][] s=new char[r][c];
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                s[i][j]=input.next().charAt(0);
            }
        }
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0&&j==0)
                {
                   if(s[i][j]=='.'&&s[i][j+1]=='.'&&s[i+1][j]=='.')
                    {
                     count++; 
                     }
                }
                if(j==0)
                {
                   if(s[i][j]=='.'&&s[i-1][j]=='.'&&s[i+1][j]=='.'&&s[i][j+1]=='.')
                {
                    count++;
                }
                }
                if(i==r-1&&j==0)
                {
                if(s[i][j]=='.'&&s[i-1][j]=='.'&&s[i][j+1]=='.')
                {
                    count++;
                }
            }
                if(i==r-1)
                {
                
                if(s[i][j]=='.'&&s[i-1][j]=='.'&&s[i][j-1]=='.'&&s[i][j+1]=='.')
                {
                    count++;
                }}
                if(i==r-1&&j==c-1){
                if(s[i][j]=='.'&&s[i-1][j]=='.'&&s[i][j-1]=='.')
                {
                    count++;
                }}
                if(j==c-1)
                {
                
                if(s[i][j]=='.'&&s[i][j-1]=='.'&&s[i-1][j]=='.'&&s[i+1][j]=='.')
                {
                    count++;
                }
                }
                if(i==0&&j==c-1){
                
               if(s[i][j]=='.'&&s[i][j-1]=='.'&&s[i+1][j]=='.')
                {
                    count++;
                }
            }
                if(i==0)
                {
                if(s[i][j]=='.'&&s[i+1][j]=='.'&&s[i][j-1]=='.'&&s[i][j+1]=='.')
                {
                    count++;
                }}
                
               /* if(i!=0&&i!=r-1&&j!=0&&j!=c-1&&s[i][j]=='.'&&s[i-1][j]=='.'&&s[i+1][j]=='.'&&s[i][j-1]=='.'&&s[i][j+1]=='.')
                {
                    count++;
                }*/
               // System.out.print(" "+s[i][j]);
            }
        }
         System.out.println(count);
        }
    }
    

