
package hackerrranksolving;

import java.util.Scanner;


public class Mainclass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        while(n--!=0)
        {
            String s=input.nextLine();
            if(s.matches(Validusernm.regularexp))
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("notvalid");
            }
            
        }
    
}
}