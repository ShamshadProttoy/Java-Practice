
package resturantsmanagemento02;


public class Menu {
    
   private Fooditem fooditem; 
   private Drinksitem drinksitem;

    public Menu(Fooditem fooditem, Drinksitem drinksitem) {
        this.fooditem = fooditem;
        this.drinksitem = drinksitem;
    }

    public Fooditem getFooditem() {
        return fooditem;
    }

    public void setFooditem(Fooditem fooditem) {
        this.fooditem = fooditem;
    }

    public Drinksitem getDrinksitem() {
        return drinksitem;
    }

    public void setDrinksitem(Drinksitem drinksitem) {
        this.drinksitem = drinksitem;
    }
   
   public void additem(int id, String type)
   {
       System.out.println(type+"has been added");
   }
   public void rmvitem(int id, String type)
   {
       System.out.println(type+"has been removedhtfh");
   }
    
  

}
