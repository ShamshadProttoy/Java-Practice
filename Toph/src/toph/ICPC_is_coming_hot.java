
package toph;

import java.util.Scanner;


public class ICPC_is_coming_hot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int store=0;
        char temp='0';
        long min;
        min = 999999999;
        String s=input.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
                if(count>store)
                {
                    store=count;
                    temp=s.charAt(i);
                }
            }
            
        }
         System.out.println(temp);
       
            }          
    
}
