
package resturant.management;


public class Account {
    
    int accountid;
    int empldid;
    String username;
    String password;
    Role role;

    public Account(int accountid, int empldid, String username, String password, Role role) {
        this.accountid = accountid;
        this.empldid = empldid;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    
    
}
