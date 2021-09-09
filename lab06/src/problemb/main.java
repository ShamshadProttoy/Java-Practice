
package problemb;

public class main {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("tiger",4);
        Lion lion=new Lion("lion",4);
        Deer deer=new Deer("deer",4);
        System.out.println(tiger.diet());
        System.out.println(lion.diet());
        System.out.println(deer.diet());
        
        Animal[] animal=new Animal[3];
        animal[0]=new Tiger("tiger",4);
        animal[1]=new Lion("lion",4);
        animal[2]=new Deer("deer",4);
        Information info=new Information(animal);
        info.show();
    }
}
