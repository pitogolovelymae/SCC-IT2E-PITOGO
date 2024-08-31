
package pitogo2e;
 

public class products {
    
    int id;
    String name;
    Double price;
    int stocks,sold;
    
    public void addProducts(int pid, String pname, double pprice, int pstocks, int psold){
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.stocks = pstocks;
        this.sold = psold;
    }
    
    
    public void viewProducts(){
        double profit = this.price * this.sold;
        double tep = this.stocks * this.price;
        String status = (this.stocks > 0) ? "Available": "Out-of-Stock";
        
        System.out.printf("%-10 %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
                this.id,this.name, this.price, this.stocks, this.sold, profit, tep, status);
        
    }
}
