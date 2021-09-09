
package bankproject;



public class SavingsAccount extends Account implements Bonus {
    

    @Override
    public double withdraw(double ammount) {
        return super.withdraw(ammount); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposit(double depoammount) {
        super.deposit(depoammount);
        //To change body of generated methods, choose Tools | Templates.
    }

    public double getDepoammount() {
        double depoammount = 0;
        return depoammount;
    }

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }
    public void display()
    {
        System.out.println("Name="+super.getName());
        System.out.println("Balance="+super.getBalance());
        
    }

    @Override
    public double checkbalance() {
        double ammount = 0;
           double balancecheck=super.getBalance()+super.deposit(ammount)-super.withdraw(ammount);
    return balancecheck;
    }

    @Override
    public double interest() {
         double balanceinterest=super.getBalance()*12/100;
         return balanceinterest;
    }

    @Override
    public double bonus() {
         double bonusbalance=500;
         return bonusbalance;
    }
    
    
    
}
