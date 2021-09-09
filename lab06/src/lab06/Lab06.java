
package lab06;

public class Lab06 {

    
    public static void main(String[] args) {
        
        Agora ag=new Agora("dhanmondi","01874416496","27no","b plaza");
        ag.display();
        
        Item item=new Item(9898,"lenevo","98754.90");
        item.display();
        
        Customer customer=new Customer("9864","prottoy");
        customer.display();
        
        Buy buy=new Buy("17 march",999,item,customer);
         Outlet outlet=new Outlet(ag,item);
         outlet.display();
                
                
                }
    
}
