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
               break;
            case 2:
               membersDatabase.printAllMembers();
               break;
         
            // Accountant
            case 3:
               System.out.println("Register a payment");
               
               System.out.println("Enter member ID:");
               String memberId = scanner.nextLine();
              
               membersDatabase.getMembers();
               
               Accounting.createInvoice(member); 
               
               Accounting.printReceipt();
                         
            break;
        
        case 4:
               accounting.printOverdues(){
               System.out.println(invoice.toString());
                    break;                                                    
 
            // Coach
            case 5:
               System.out.println("Enter member ID:");
               String memberId = scanner.nextLine();

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
                  if (member.getMemberId().equals(memberId) && member instanceof Competitor) {
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