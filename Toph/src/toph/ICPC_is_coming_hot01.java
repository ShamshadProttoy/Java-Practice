
package toph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ICPC_is_coming_hot01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.nextLine();
        int store=0;
        char temp='0';
        ArrayList<Character> number=new ArrayList<>();
        for(int i=0;i<n.length();i++)
        {
            number.add(n.charAt(i));
        }
        Collections.sort(number);
        //System.out.println(number.get(2));
        for(int i=0;i<n.length();i++)
        {
            int count=0;
            for(int j=i+1;j<n.length();j++)
            {
                if(number.get(i)==number.get(j))
                {
                    count++;
                }
            }
            if(count>store)
            {
                store=count;
                temp=number.get(i);
                
            }
        }
        System.out.println(temp);
        
    }
    
}
