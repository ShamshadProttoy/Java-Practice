
package lab06;

public class Outlet {
    Agora ag;
    Item item;

    public Outlet(Agora ag, Item item) {
        this.ag = ag;
        this.item = item;
    }
    
    public void display()
    {
        System.out.println("display all");
    }
}
