
package bankproject;

public class BankProject {

    public static void main(String[] args) {
        
        SavingsAccount[] savingaccount=new SavingsAccount[1];
         
         savingaccount[0]=new SavingsAccount("rahim",40000);
         savingaccount[0].deposit(10000);
         savingaccount[0].withdraw(5000);
         Showedinfo in=new Showedinfo(savingaccount);
         in.showed();
      
    }
    
}
