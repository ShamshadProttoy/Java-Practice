
package anisulislam;


public class FinalizeDemo {
    @Override
    public void finalize(){System.out.println("finalize called");}
    
    public static void main(String[] args) {
       FinalizeDemo f1=new FinalizeDemo();  
FinalizeDemo f2=new FinalizeDemo();  
f1=null;  
f2=null;  
System.gc(); 
    }
    
}
