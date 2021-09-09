
package filecreating;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Filewriting {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        Agora agora=new Agora("01935-67467","agora.@gmail.com","dhanmondi 27");
        agora.display();
        
        System.out.println("Type item id:");
        String s1=input.next();
        System.out.println("Type item name:");
        String s2=input.next();
        System.out.println("Type item price:");
        double d=input.nextDouble();
        
        System.out.println("Cell no:");
        String s3=input.next();
        System.out.println("Email:");
        String s4=input.next();
        System.out.println("customerid no:");
        String s5=input.next();
        
        Item item=new Item(s1,s2,d);
        Rahim rahim=new Rahim(s3,s4,item,s5);
        item.display();
        rahim.display();
      
        try{
            Formatter formatter2=new Formatter("C:/Users/DOLPHIN/Documents/NetBeansProjects/Filecreating/iteminfo.txt" );
           Formatter formatter1=new Formatter("C:/Users/DOLPHIN/Documents/NetBeansProjects/Filecreating/customerinfo.txt");
            formatter2.format("%s      %s          %s\r\n",s1,s2,d);
            formatter1.format("%s      %s          %s \r\n",s3,s4,s5);
         
            formatter2.close();
            formatter1.close();
            
            
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        
    }
    
}
