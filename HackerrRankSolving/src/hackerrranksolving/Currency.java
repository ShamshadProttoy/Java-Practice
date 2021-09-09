
package hackerrranksolving;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double payment=input.nextDouble();
        
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale=new Locale("en","In");
        NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china=NumberFormat.getNumberInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println(Locale.US.getCountry()+": "+us.format(payment));
        System.out.println(indiaLocale.getDisplayCountry()+": "+india.format(payment));
        System.out.println(Locale.CHINA.getDisplayCountry()+": "+china.format(payment));
        System.out.println(Locale.FRANCE.getDisplayCountry()+": "+france.format(payment));
       
       
    }
    
}
