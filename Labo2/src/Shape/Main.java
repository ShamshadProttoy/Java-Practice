
package Shape;


public class Main {
    public static void main(String[] args) {
        Shape s=new Shape();
        Circle c=new Circle();
        Triangle t = new Triangle();
        Square sq=new Square();
        s.draw();
        s.erase();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        sq.draw();
        sq.erase();
    }
    
}
