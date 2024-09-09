package pitogo2e;

public class Sales {
    
    String cname, pname;
    int qty;
    double price, cash;
    
    
    public void addSales(String coname, String poname, int quant, double pri, double csh){
        this.cname = coname;
        this.pname = poname;
        this.qty = quant;
        this.price = pri;
        this.cash = csh;
        
    }
    
       
        
    public void viewSales(){
        double tdue = qty * price;
        double change = cash - tdue;
        
        System.out.printf("%-10s %-10s %-10d %-10.2f %-10.2f %-10.2f %-10.2f",
                this.cname, this.pname, this.qty, this.price, this.cash, tdue, change);
    }
    
    
    
}
    

