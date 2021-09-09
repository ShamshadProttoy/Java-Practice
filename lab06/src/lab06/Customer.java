
package lab06;

public class Customer {
    String cusld;
    String name;

    public Customer(String cusld, String name) {
        this.cusld = cusld;
        this.name = name;
    }
    
   public void display()
   {
       System.out.println("CUSLD:"+cusld);
       System.out.println("NAME:"+name);
   }
    
}
