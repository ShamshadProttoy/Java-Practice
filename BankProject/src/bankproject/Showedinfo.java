
package bankproject;

public class Showedinfo {
    
    SavingsAccount[] savingaccount;

    public Showedinfo(SavingsAccount[] savingaccount) {
        this.savingaccount = savingaccount;
    }
    
public void showed()
{
    for(SavingsAccount savingaccount:savingaccount)
    {
        savingaccount.display();
        System.out.println("Checkbalance="+savingaccount.checkbalance());
        System.out.println(" Bonus"+savingaccount.bonus());
        System.out.println(" Interest"+savingaccount.interest());
       
       
    }
}
   

   
    
    
    
}
