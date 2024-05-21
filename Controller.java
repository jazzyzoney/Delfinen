import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {



   public static void controller(){
   Scanner scanner = new Scanner(System.in);
   DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");   
   MembersDatabase membersDatabase = new MembersDatabase();
   //membersDatabase.generateSomeMembers();
      
     
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
         
         scanner.nextLine();
         
         switch(option){
            //Chairman
            case 1:
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter birth date (yyyy-MM-dd):");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, dateFormatter);

        System.out.println("Enter active membership status (true/false):");
        boolean activeMembership = Boolean.parseBoolean(scanner.nextLine());
                
        System.out.println("Enter swim type (COMPETITIVE/NONCOMPETITIVE):");
        SwimType swimType = SwimType.valueOf(scanner.nextLine().toUpperCase());
        

        Member newMember = new Member(name, phoneNumber, birthDate, swimType, activeMembership);
        membersDatabase.addMember(newMember);
         
         
        System.out.println("Member added successfully!");
        membersDatabase.printMemberInfo(newMember);
  
        break;
            case 2:
               membersDatabase.printAllMembers();
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