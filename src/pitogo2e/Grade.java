
package pitogo2e;

import java.util.Scanner;

public class Grade {
    
    public void displayGrade(){
        Grades[] gr = new Grades[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int st = sc.nextInt();
        
        
        for(int i = 0; i < st; i++){
            System.out.println("\nEnter details of student "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pre = sc.nextDouble();
            System.out.print("Midterm: ");
            double mid = sc.nextDouble();
            System.out.print("Prefi: ");
            double pref = sc.nextDouble();
            System.out.print("Final: ");
            double fin = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id,name,pre,mid,pref,fin);
        }
        
        double tca = 0;
        int passed = 0;
        int failed = 0;
        
        for(int i = 0; i <st; i++){
            gr[i].average = (gr[i].p+gr[i].m+gr[i].pf+gr[i].f)/4;
            tca += gr[i].average;
            
            gr[i].viewGrades();
            
            if(gr[i].average < 3.0){
                passed++;
            } else{
                failed++;
            }
        }
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("No. of students: "+st);
        System.out.println("Total Class Average: "+tca/st);
        System.out.println("No. of Passed: "+passed);
        System.out.println("No. of Failed: "+failed);
    }
}


