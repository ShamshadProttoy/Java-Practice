
package lab06;

public class Item {
    int itemid;
    String name;
    String price;

    public Item(int itemid, String name, String price) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
    }
    
    public void display()
    {
        System.out.println("ITEMID:"+itemid);
        System.out.println("NAME:"+name);
        System.out.println("PRICE:"+price);
    }
    
}
