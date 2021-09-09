
package encapsulation;

public class Idno extends Encapsu {
    private int idno;

    public Idno(int idno, String name) {
        super(name);
        this.idno = idno;
    }

  public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }
     
    public void display()
    {
        super.display();
        System.out.println(idno);
        
    }
}

