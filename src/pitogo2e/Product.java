package pitogo2e;

import java.util.Scanner;

public class Product {
    
    int id, stocks, sld;
    String pname;
    double pri;
    int pfit, tep;
    Product[] p = new Product[100];
    
    public void getProduct() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the number of Products: ");
        int np = sc.nextInt();
        p = new Product[np];  
        
        for (int i = 0; i < np; i++) {
            System.out.println("\nEnter the Details for Product " + (i + 1));
            p[i] = new Product(); 
            
            System.out.print("ID: ");
            p[i].id = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Product Name: ");
            p[i].pname = sc.nextLine();
            
            System.out.print("Price: ");
            p[i].pri = sc.nextDouble();
            
            System.out.print("Stocks: ");
            p[i].stocks = sc.nextInt();
            
            System.out.print("Sold: ");
            p[i].sld = sc.nextInt();
            sc.nextLine();
            
            p[i].pfit = (int) (p[i].pri * p[i].sld);  
            p[i].tep = (int) (p[i].pri * p[i].stocks);    
        }
    }
    
    public void viewProduct() {
        double totalProfit = 0, totalTep = 0;
        
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "TEP", "Status");
        
        for (Product product : p) {
            if (product != null) {
                String status = product.stocks > 0 ? "Available" : "Out of Stock";
                System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10d %-10d %-10s\n", 
                        product.id, product.pname, product.pri, product.stocks, product.sld, 
                        product.pfit, product.tep, status);
                totalProfit += product.pfit;
                totalTep += product.tep;
            }
        }
        
        System.out.println("\n---------------------------------");
        System.out.printf("Total Profits: %.2f\n", totalProfit);
        System.out.printf("Total Estimate Price: %.2f\n", totalTep);
    }

}

