
package toph;

import java.util.Scanner;

public class BPLdhamaka {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        while(n>0)
        {
            int count=0;
            String s=input.nextLine();
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='W'||c=='N'||c=='D')
                {
                    continue;
                    
                }
                count++;
                
            }
           // System.out.println("Count="+count);
            if(count>5)
        {
            if(count%6==0)
            {
                int t=count/6;
                if(t==1)
                System.out.println((t)+" OVER");
                else
                 System.out.println((t)+" OVERS");   
            }
            else{
            int t=count/6;
            int f=count%6;
            if(t==1&&f==1)
            System.out.println((t)+" OVER "+(f)+" BALL");
            else if(t==1&&f>1)
                 System.out.println((t)+" OVER "+(f)+" BALLS");
            else if(t>1&&f==1)
                 System.out.println((t)+" OVERS "+(f)+" BALL");
            else
                 System.out.println((t)+" OVERS "+(f)+" BALLS");
                
            }
            
        }
            else{
                if(count>1)
                System.out.println((count)+" BALLS");
                else
                    System.out.println((count)+" BALL");
                    
            }
            n--;
        }
        
        
        
    }
    
}
