/*import java.util.ArrayList;
import java.time.localDate;*/
import java.util.Scanner;

public class Controller {

public class Main {


    public static void main(String[] args) {
        MembersDatabase membersDatabase = new MembersDatabase();
        generateSomeMembers(membersDatabase);

        userInputMenu(membersDatabase);
    }

    private static void userInputMenu( MembersDatabase membersDatabase) {
        Scanner scanner = new Scanner(System.in);
        int option;
}

   private static Scanner scanner = new Scanner(System.in);

   public static void controller(){
   
   do {
            System.out.println();
            System.out.println("Welcome to the Swimming Club Management System!");
            System.out.println("Please choose an option:");
            System.out.println("*************************************************");
            System.out.println("1. Insert a new member");
            System.out.println("2. Update a members swimming time");
            System.out.println("3. Register a payment");
            System.out.println("4. Print all members");
            System.out.println("5. Print members with outstanding balance");
            System.out.println("6. Print top 5 fastest ");
            System.out.println("7. Print top 5 fastest ");
            System.out.println("8. Print top 5 fastest");
            System.out.println("10. Exit");
            System.out.println("*************************************************");

            option = scanner.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Insert a new member");
                    break;
                case 2:
                    System.out.println("Update a members swimming time");
                    break;
                case 3:
                    System.out.println("Register a payment");
                    break;
                case 4:
                    System.out.println("Print all members");
                    membersDatabase.printAllMembers();
                    break;
                case 5:
                    System.out.println("Print members with outstanding balance");
                    membersDatabase.printMembersWithBalance();
                    break;
                case 6:
                    System.out.println("Print top 5 ");
                    break;
                case 7:
                    System.out.println("Print top 5 ");
                    break;
                case 8:
                    System.out.println("Print top 5 ");
                    break;
                case 10:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 10);
    }

    private static void generateSomeMembers(MembersDatabase membersDatabase){   
   //membersDatabase.addMember
   }
   }
