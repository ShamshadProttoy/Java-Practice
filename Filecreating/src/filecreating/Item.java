
package filecreating;


public class Item {
    
    String itemid;
    String name;
    double price;

    public Item(String itemid, String name, double price) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
    }
    
    public void display()
    {
        
        System.out.println("ITEM ID:"+itemid);
        System.out.println("ITEM NAME:"+name);
        System.out.println("ITEM PRICE:"+price);
    }
    
}
