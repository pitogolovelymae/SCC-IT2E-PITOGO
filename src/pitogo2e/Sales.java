
package pitogo2e;

import java.util.Scanner;

public class Sales {
    Scanner input = new Scanner(System.in);
    
    public void getsales(){
        System.out.print("Customer Name: ");
        String customer = input.nextLine();
        System.out.print("Product Name: ");
        String product = input.nextLine();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Price: ");
        float price = input.nextFloat();
        System.out.print("Cash: ");
        float cash = input.nextFloat();
        
        System.out.println("\n-----------------------------------");
        System.out.println("RECIEPT");
        System.out.println("-----------------------------------");
        
        System.out.println("Name: " + customer);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        float total = price * quantity;
        System.out.println("Total Due: " + total);
        System.out.println("Chance: " + (cash - total));
        
    }
    
}
