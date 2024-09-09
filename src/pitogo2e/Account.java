package pitogo2e;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    Accounts[] ac = new Accounts[100];
    
    public void getAccounts(){
        
        System.out.print("\nAdd number of users: ");
        int ucount = sc.nextInt();
        sc.nextLine(); 
        
        for(int i = 0; i < ucount; i++){
            System.out.println("\nEnter details of User " + (i + 1));
            
            System.out.print("ID: ");
            int uid = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("First name: ");
            String firstname = sc.nextLine();
            
            System.out.print("Last name: ");
            String lastname = sc.nextLine();
            
            System.out.print("Email: ");
            String emailadd = sc.nextLine();
            
            System.out.print("Username: ");
            String usern = sc.nextLine();
            
            System.out.println("\nPassword Criteria:"
                    + "\n1. Must be above 8 characters"
                    + "\n2. Must have at least 1 upper & 1 lower case letter"
                    + "\n3. Must have at least 1 number"
                    + "\n4. Must have at least 1 special character"
                    + "\n5. Must not be a common password like 'admin', 'password', or '1234'");
            
            System.out.print("\nPassword: ");
            String passw = sc.nextLine();
            
          
            while(!passwordVerify(passw)){
                System.out.print("\nPassword: ");
                passw = sc.nextLine();
            }
            
            
            if(duplicateVerify(uid, emailadd, usern, i)){
                i--; 
                continue;
            }
            
            ac[i] = new Accounts();
            ac[i].addAccounts(uid, firstname, lastname, emailadd, usern, passw);
        }
        
        
        System.out.printf("\n\n%-5s %-15s %-15s %-20s %-15s %-15s\n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
        
        for(int i = 0; i < ucount; i++){
            ac[i].viewAccounts();
        }
    }
    
   
    private boolean duplicateVerify(int id, String email, String username, int index){
        for(int x = 0; x < index; x++){
            if(id == ac[x].aid){
                System.out.println("\nInput invalid, ID is already used.");
                return true;
            } else if(email.equals(ac[x].email)){
                System.out.println("\nInput invalid, email is already used.");
                return true;
            } else if(username.equals(ac[x].user)){
                System.out.println("\nInput invalid, username is already used.");
                return true;
            }
        }
        return false;
    }
    

    private boolean passwordVerify(String password){
        if(password.length() <= 8){
            System.out.println("\nPassword is invalid, it must be more than 8 characters long.");
            return false;
        }
        
        if(password.equals("admin") || password.equals("password") || password.equals("1234")){
            System.out.println("\nPassword is invalid, it cannot be a common password like 'admin', 'password', or '1234'.");
            return false;
        }
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
 
        for(char z : password.toCharArray()){
            if(Character.isLowerCase(z)){
                hasLowercase = true;
            } else if(Character.isUpperCase(z)){
                hasUppercase = true;
            } else if(Character.isDigit(z)){
                hasDigit = true;
            } else if(!Character.isLetterOrDigit(z)){
                hasSpecialChar = true;
            }
        }
        
        if(!hasUppercase || !hasLowercase){
            System.out.println("\nPassword is invalid, it must have at least one uppercase and one lowercase letter.");
            return false;
        } else if(!hasDigit){
            System.out.println("\nPassword is invalid, it must have at least one number.");
            return false;
        } else if(!hasSpecialChar){
            System.out.println("\nPassword is invalid, it must have at least one special character.");
            return false;
        }
        return true;
    }
}
