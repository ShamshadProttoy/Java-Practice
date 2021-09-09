
package problemb;

public  class Tiger extends Animal {

    public Tiger(String name, int leg) {
        super(name, leg);
    }



    @Override
    public String diet() {
        return "animal name="+name+"\nleg="+leg;
   
    }
        
        
        
    
}
