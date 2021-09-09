
package getset;


public class GetSet {
    private String name;
    private int id;
  private  double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  

  
   
    public void display()
    {
        System.out.println("name "+name);
        System.out.println("id "+id);
        System.out.println("price"+price);
        
         
    }
    
    
}
