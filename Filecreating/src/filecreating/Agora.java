
package filecreating;


public class Agora extends Shop{
    
    String cellno;
    String aemail;

    public Agora(String cellno, String aemail, String location) {
        super(location);
        this.cellno = cellno;
        this.aemail = aemail;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("CELL NO:"+cellno);
        System.out.println("EMAIL:"+aemail);
    }
    
    
    
}
