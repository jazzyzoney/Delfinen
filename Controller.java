import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

   public static void main(String[] args) {
      controller();
   }

   public static void controller() {
      Scanner scanner = new Scanner(System.in);
      DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      MembersDatabase membersDatabase = new MembersDatabase();
      CompetitionHandler competitionHandler = new CompetitionHandler();
      membersDatabase.generateSomeMembers();
      InvoiceDatabase invoiceDatabase = new InvoiceDatabase();
      Accounting accounting = new Accounting();
 
     //List<Member> members = new ArrayList<>();
     //Invoice invoice = new Invoice();
                     
      do {
         System.out.println();
         System.out.println("Welcome to the Swimming Club Management System!\n");
         System.out.println("Please choose an option:");
         System.out.println("*************************************************");
         // Chairman
         System.out.println("1. Register new member");
         System.out.println("2. Print all members");
         // Accountant
         System.out.println("3. Create invoice");
         System.out.println("4. Print members in arrears");
         // Coach
         System.out.println("5. Register result");
         System.out.println("6. Print top five swimmers");
         System.out.println("7. Exit");
         System.out.println("*************************************************");
      
         int option = scanner.nextInt();
         scanner.nextLine();
      
         switch (option) {
            // Chairman
            case 1:
               try {
               System.out.println("Enter first Name and last Name:");
               String name = scanner.nextLine();
            
               System.out.println("Enter phone number (8 numbers):");
               String phoneNumber = scanner.nextLine();
               
               if (phoneNumber.length() != 8 || !phoneNumber.matches("\\d+")) {
                throw new IllegalArgumentException("Phone number must be exactly 8 digits.");
               }
               System.out.println("Enter birth date (yyyy-MM-dd):");
               String birthDateString = scanner.nextLine();
               LocalDate birthDate = LocalDate.parse(birthDateString, dateFormatter);
            
               System.out.println("Enter active membership status (true/false):");
               boolean activeMembership = Boolean.parseBoolean(scanner.nextLine());
            
               System.out.println("Enter swim type (COMPETITIVE/NONCOMPETITIVE):");
               SwimType swimType = SwimType.valueOf(scanner.nextLine().toUpperCase());
            
               Member newMember;
               if (swimType == SwimType.COMPETITIVE) {
                  System.out.println("Enter coach name:");
                  String coach = scanner.nextLine();
               
                  System.out.println("Enter disciplines (Back Crawl, Crawl, Breast, Butterfly)(comma-separated):");
                  String disciplinesInput = scanner.nextLine();
                  String[] disciplinesArray = disciplinesInput.split(",");
                  List<String> disciplines = new ArrayList<>();
                  for (String discipline : disciplinesArray) {
                     disciplines.add(discipline.trim());
                  }
               
                  newMember = new Competitor(name, phoneNumber, birthDate, swimType, activeMembership, coach, disciplines);
                  competitionHandler.addMemberToDiscipline((Competitor) newMember);
                  System.out.println("Competitor added successfully!");
               } else {
                  newMember = new Member(name, phoneNumber, birthDate, swimType, activeMembership);
               }
               
               membersDatabase.addMember(newMember);
               System.out.println("Member added successfully!");
               membersDatabase.printMemberInfo(newMember);
               } catch (Exception e) {
                        System.out.println("An error occurred:Check birthDate format ");
                    }
               break;
            case 2:
               membersDatabase.printAllMembers();
               break;
         
            // Accountant
            case 3:
               System.out.println("Register a payment");
               
               System.out.println("Enter member ID: ");
               String memberId = scanner.nextLine();
              
               Member accountingMember = null;
               
               for (Member currentMember : membersDatabase.members) {
               if (currentMember.getMemberId().equals(memberId)) {
                     accountingMember = currentMember;
                  }
                  }
                  
                  accounting.createInvoice(accountingMember);
                  
                  break;

              
              
        //boolean found = false;
        //for (Member member : members) {
            //if (member.getMemberId().equals(memberId)) {
               // System.out.println("Found member: " + member.getName());
               // found = true;
               // break;
           // }
        //}
        //if (!found) {
        //    System.out.println("Member not found.");
       // } 
       
               
               /* System.out.println("Enter member ID:");
               String memberId = scanner.nextLine();
              
               List<Member> members = membersDatabase.getMembers();
                 for (Member member : members) {
                  if (member.getMemberId() == memberId) {
                   System.out.println("Found member: " + member.getName());
                   break;
                  }
                 } 
                 */
                 
              // 1 member -> sendes til createInvoice 
        
            case 4:
              invoiceDatabase.printOverdues(); 
              
                break;                                                    
 
            // Coach
            case 5:
               System.out.println("Enter member ID:");
               String getMemberId = scanner.nextLine();

               System.out.println("Enter discipline (Back Crawl, Crawl, Breast, Butterfly):");
               String discipline = scanner.nextLine();

               System.out.println("Enter result type (1: Training, 2: Competition):");
               int resultType = scanner.nextInt();
               scanner.nextLine();  // consume newline

               System.out.println("Enter result time (mm:ss.SSS):");
               String resultTime = scanner.nextLine();
               LocalTime result = LocalTime.parse(resultTime);
            
               // Find the competitor
               Competitor competitor = null;
               for (Member member : membersDatabase.getMembers()) {
                  if (member.getMemberId().equals(getMemberId) && member instanceof Competitor) {
                     competitor = (Competitor) member;
                     break;
                  }
               }
            
               if (competitor != null) {
                  competitionHandler.RecordResult(resultType, competitor, result, discipline);
                  System.out.println("Result recorded successfully!");
               } else {
                  System.out.println("Competitor not found!");
               }
               break;
               
            case 6:
               System.out.println("Enter discipline number (1: Back Crawl, 2: Crawl, 3: Breast, 4: Butterfly):");
               int disciplineNumber = scanner.nextInt();
               competitionHandler.TopFive(disciplineNumber);
               break;
         
            case 7:
               System.out.println("Exit");
               scanner.close();
               System.exit(0);
               break;
            default:
               System.out.println("Invalid option. Please try again.");
         }
      } while (true);
   }
}
