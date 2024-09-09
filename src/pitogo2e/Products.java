package pitogo2e;

public class Products {
    
    int id;
    String pname;
    double pri;
    int stocks, sld;
    
    public void addProducts(int id, String pname, double pprice, int pstocks, int psold){
        
        this.id = id;
        this.pname = pname;
        this.pri = pprice;
        this.stocks = pstocks;
        this.sld = psold;
        
    }
    
    public void viewProducts() {
        double profit =  this.pri * this.sld;
        double tep = this.stocks * this.pri;
        
        String status = (this.stocks > 0) ? "Available" : "Out-of-Stock";
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
                           this.id, this.pname, this.pri, this.stocks, this.sld, profit, tep, status);
    }
}
