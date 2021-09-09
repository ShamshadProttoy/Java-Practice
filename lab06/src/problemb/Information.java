
package problemb;

public class Information {
    Animal[] animal;

    public Information(Animal[] animal) {
        this.animal = animal;
    }
    
    public void show()
    {
        for(Animal animal:animal)
        {
            
        
        System.out.println( "animal name="+animal.name+"\nleg="+animal.leg);
    }
}}
