
package resturantsmanagemento02;


public class Order {
    
    private int customerid;
    private int menuid;
    private String quantity;

    public Order(int customerid, int menuid, String quantity) {
        this.customerid = customerid;
        this.menuid = menuid;
        this.quantity = quantity;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
    
    
    
    
}
