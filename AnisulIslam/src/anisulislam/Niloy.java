
package anisulislam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Niloy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Pattern p=Pattern.compile(input.nextLine());
        Matcher m=p.matcher(input.nextLine());
        
        boolean b=false;
        if(m.find())
        {
            System.out.println("this text has been extracted from your paragraph:"+m.group());
            b=true;
        }
        else
        {
            System.out.println("Not found!....");
        }
    }
    
}
