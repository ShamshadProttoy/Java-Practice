
package lab06;


public class Agora extends Shop{
    String outlet;
    String cell;

    public Agora(String outlet, String cell, String location, String address) {
        super(location, address);
        this.outlet = outlet;
        this.cell = cell;
    }

    @Override
   public void display()
   {
       super.display();
       System.out.println("OUTLET:"+outlet);
       System.out.println("CELL:"+cell);
   }
    
    
}
