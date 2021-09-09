
package hackerrranksolving;

import java.util.Scanner;

public class StringToken {
    
    public static String checkofletter(String str)
    {
        int i;
        for( i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                break;
            }
          
        }
        return str.substring(i);
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
       s=checkofletter(s);
       
       String[] arr=s.split("[-]+");
         System.out.println(arr.length);
        for(String w:arr)
        {
            System.out.println(w);
        }
    }
            
    
}
