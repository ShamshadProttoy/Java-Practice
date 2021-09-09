
package problemb;

public class Deer extends Animal {

    public Deer(String name, int leg) {
        super(name, leg);
    }

    @Override
    public String diet() {
      return  "animal name="+name+"\nleg="+leg; //To change body of generated methods, choose Tools | Templates.
    }
    
}
