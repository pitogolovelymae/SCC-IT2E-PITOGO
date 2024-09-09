
package pitogo2e;

import java.util.Scanner;

public class Sale {
     Scanner input = new Scanner(System.in);
        
        public void getSale(){
            System.out.print("Customer Name: ");
            String customer = input.nextLine();
            System.out.print("Product Name: ");
            String product = input.nextLine();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            System.out.print("Price: ");
            double price = input.nextFloat();
            System.out.print("Cash: ");
            double cash = input.nextFloat();

            System.out.println("\n-----------------------------------");
            System.out.println("RECIEPT");
            System.out.println("-----------------------------------");

            System.out.println("Name: " + customer);
            System.out.println("Product: " + product);
            System.out.println("Quantity: " + quantity);
            double total = price * quantity;
            System.out.println("Total Due: " + total);
            System.out.println("Change: " + (cash - total));
        
    }
    
}
