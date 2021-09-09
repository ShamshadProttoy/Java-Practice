
package resturantsmanagemento02;


public class Drinksitem {
    
    private int drinkid;
    private String drinktype;
    private boolean available;

    public Drinksitem(int drinkid, String drinktype, boolean available) {
        this.drinkid = drinkid;
        this.drinktype = drinktype;
        this.available = available;
    }

    public int getDrinkid() {
        return drinkid;
    }

    public void setDrinkid(int drinkid) {
        this.drinkid = drinkid;
    }

    public String getDrinktype() {
        return drinktype;
    }

    public void setDrinktype(String drinktype) {
        this.drinktype = drinktype;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
}
