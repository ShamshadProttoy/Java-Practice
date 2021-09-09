
package hackerrranksolving;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        
       /* ResourceBundle bundle=ResourceBundle.getBundle("MessageBundle",Locale.CANADA);
        System.out.println("message in"+Locale.CANADA+":"+bundle.getString("greeting"));
        */
       
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  

        
    }
    
}
