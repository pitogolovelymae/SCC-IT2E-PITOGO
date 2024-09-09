package pitogo2e;

public class Accounts {
    
    int aid;
    String firstName, lastName, email, user, password;

    
    public void addAccounts(int id, String fname, String lname, String eadd, String uname, String passw) {
        this.aid = id;
        this.firstName = fname;
        this.lastName = lname;
        this.email = eadd;
        this.user = uname;
        this.password = passw;
    }

    
    public void viewAccounts() {
        System.out.printf("%-5d %-15s %-15s %-20s %-15s %-15s\n", this.aid, this.firstName, this.lastName, this.email, this.user, this.password);
    }    
}
