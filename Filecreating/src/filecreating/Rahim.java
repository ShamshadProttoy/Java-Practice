
package filecreating;

public class Rahim extends Customer{
    String cell;
    String email;
    Item item;

    public Rahim(String cell, String email, Item item, String cusid) {
        super(cusid);
        this.cell = cell;
        this.email = email;
        this.item = item;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("CUSTOMER CELL NO:"+cell);
        System.out.println("EMAIL:"+email);
    }

    
    
    
    
    
}
