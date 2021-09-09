
package anisulislam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest{

    /**
     *
     * @param a
     */
    static public void test(int a)
    {
        if(a<18){
            try {
                throw new Invalid("not valid");
            } catch (Invalid ex) {
                System.out.println(ex);
            }
        }
        else
        {
            System.out.println("okay");
        }
         
              
        
    }
    public static void main(String[] args) {
        test(15);
    }
            
    
    
}
