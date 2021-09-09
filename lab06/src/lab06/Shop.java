
package lab06;


public class Shop {
    
   String location;
   String address;

    public Shop(String location, String address) {
        this.location = location;
        this.address = address;
    }
   
   public void display()
   {
       System.out.println("LOCATION:"+location);
       System.out.println("ADDRESS:"+address);
   }
    
}
