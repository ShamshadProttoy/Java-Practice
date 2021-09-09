
package lab06;

public class Buy {
    String date;
    int qty;
    Item item;
    Customer customer;

    public Buy(String date, int qty, Item item, Customer customer) {
        this.date = date;
        this.qty = qty;
        this.item = item;
        this.customer = customer;
    }
    public void display()
    {
        System.out.println("DATE:"+date);
        System.out.println("QTY:"+qty);
    }
}
