/*import java.util.ArrayList;
import java.time.localDate;*/
import java.util.Scanner;

public class Controller {

     
   private static void generateSomeMembers(MembersDatabase membersDatabase){   
   //membersDatabase.addMember
   }

   private static void userInputMenu( MembersDatabase membersDatabase) {
      Scanner scanner = new Scanner(System.in);
      //int option = 0;
   }

   private static Scanner scanner = new Scanner(System.in);

   public static void controller(){
   
      MembersDatabase membersDatabase = new MembersDatabase();
      generateSomeMembers(membersDatabase);
   
      userInputMenu(membersDatabase);
   
      do {
         System.out.println();
         System.out.println("Welcome to the Swimming Club Management System!/n");
         System.out.println("Please choose an option:");
         System.out.println("*************************************************");
         //Chairman
         System.out.println("1. Register new member");
         System.out.println("2. Print all members");
         //Accountant
         System.out.println("3. Create invoice");
         System.out.println("4. Print members in arrears");
         //Coach
         System.out.println("5. Register result");
         System.out.println("6. Print top five swimmers/n");
         System.out.println("7. Exit");
         System.out.println("*************************************************");
         
         int option = 0;
         option = scanner.nextInt();
         
         switch(option){
            //Chairman
            case 1:
               System.out.println("");
               break;
            case 2:
               System.out.println("Update a members swimming time");
               break;
               
            //Accountant
            case 3:
               System.out.println("Register a payment");
               break;
            case 4:
               System.out.println("");
               break;
               
            //Coach 
            case 5:
               System.out.println("Update a members swimming time");
               break;
            case 6:
               System.out.println("Update a members swimming time");
               break;
               
            case 7:
               System.out.println("Exit");
               break;
         }
      } while (true);
   }
}