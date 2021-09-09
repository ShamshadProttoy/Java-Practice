
package getset;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
         
        
        int id=input.nextInt();
        double price=input.nextDouble();
         GetSet p1=new GetSet();
         p1.setName(name);
         p1.setId(id);
         p1.setPrice(price);
        
         p1.display();
        
    }
    
}
