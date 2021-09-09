
package resturantsmanagemento02;


public class Fooditem {
    private int foodcode;
    private String foodname;
    private boolean availavle;

    public Fooditem(int foodcode, String foodname, boolean availavle) {
        this.foodcode = foodcode;
        this.foodname = foodname;
        this.availavle = availavle;
    }

    public int getFoodcode() {
        return foodcode;
    }

    public void setFoodcode(int foodcode) {
        this.foodcode = foodcode;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public boolean isAvailavle() {
        return availavle;
    }

    public void setAvailavle(boolean availavle) {
        this.availavle = availavle;
    }
    
    
    
}
