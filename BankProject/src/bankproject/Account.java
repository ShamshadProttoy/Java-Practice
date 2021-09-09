
package bankproject;

public abstract class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
  
    
    public void deposit(double depoammount)
    {
        System.out.println("Amount of deposit="+depoammount+"tk");
    }
    
public double withdraw (double ammount)
{
double withdraw=ammount;

return withdraw;

}

public abstract double checkbalance();


public abstract double interest();

    double getDepoammont() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

    

