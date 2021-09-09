
package problemb;

public abstract class Animal {
    String name;
    int leg;

    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }
    
    public abstract String diet();
    
    
}
