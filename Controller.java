import java.time.LocalDate;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
      DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("mm:ss.SSS");
      MembersDatabase membersDatabase = new MembersDatabase();
      CompetitionHandler competitionHandler = new CompetitionHandler();
      membersDatabase.generateSomeMembers();
      InvoiceDatabase invoiceDatabase = new InvoiceDatabase();
      Accounting accounting = new Accounting();
      invoiceDatabase.generateSomeInvoices();
             
      do {
         System.out.println();
         System.out.println("Welcome to the Swimming Club Management System!\n");
         System.out.println("Please choose an option:");
         System.out.println("*************************************************");
         // Chairman
         System.out.println("1. Register new member");
         System.out.println("2. Print all members");
         // Accountant
         System.out.println("3. Create new invoice ");
         System.out.println("4. Show members in arrears "); 
         // Coach
         System.out.println("5. Register result");
         System.out.println("6. Print top five swimmers");
         System.out.println("7. Print results");
         System.out.println("8. Exit");
         System.out.println("*************************************************");
      
         int option = scanner.nextInt();
         scanner.nextLine();
      
         switch (option) {
            // Chairman
            case 1:
               try {
                  System.out.println("Enter first Name and last Name:");
                  String name = scanner.nextLine();
               
                  String phoneNumber;
                  while (true) {
                     System.out.println("Enter phone number (8 numbers):");
                     phoneNumber = scanner.nextLine();
                     if (phoneNumber.length() == 8 && phoneNumber.matches("\\d+")) {
                        break;
                     } else {
                        System.out.println("Invalid phone number. Please enter exactly 8 digits.");
                     }
                  }
                  LocalDate birthDate;
                  while (true) {
                     System.out.println("Enter birth date (yyyy-MM-dd):");
                     String birthDateString = scanner.nextLine();
                     try {
                        birthDate = LocalDate.parse(birthDateString, dateFormatter);
                        break;
                     } catch (Exception e) {
                        System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
                     }
                  }               
                  System.out.println("Enter active membership status (true/false): ");
                  boolean activeMembership = Boolean.parseBoolean(scanner.nextLine());
               
                  SwimType swimType;
                  while (true) {
                     System.out.println("Enter swim type (COMPETITIVE/NONCOMPETITIVE):");
                     try {
                        swimType = SwimType.valueOf(scanner.nextLine().toUpperCase());
                        break;
                     } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Please enter COMPETITIVE or NONCOMPETITIVE.");
                     }
                  }
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
                  System.out.println("An error occurred:Check swim type and capital letters: ");
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
         
            case 4:
               System.out.println("Show members in arrears: ");
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
            
               System.out.println("Enter result time in format mm:ss.SSS (e.g., 02:22.111):");
               String resultTime = scanner.nextLine();
               Duration result = competitionHandler.parseDurationFromTimeString(resultTime);
               
               System.out.println("Enter result date (yyyy-MM-dd):");
               String resultDateStr = scanner.nextLine();
               LocalDate resultDate;
               try {
                  resultDate = LocalDate.parse(resultDateStr, dateFormatter);
               } catch (DateTimeParseException e) {
                  System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
                  break;
               }
               
            // Find the competitor
               Competitor competitor = null;
               for (Member member : membersDatabase.getMembers()) {
                  if (member.getMemberId().equals(getMemberId) && member instanceof Competitor) {
                     competitor = (Competitor) member;
                     break;
                  }
               }
               
               if (competitor != null) {
                  String competitionName = "";
                  if (resultType == 2) {
                     System.out.println("Enter competition name:");
                     competitionName = scanner.nextLine();
                  }
                  competitionHandler.RecordResult(resultType, competitor, resultTime, discipline, competitionName);
               } else {
                  System.out.println("Competitor not found");
               }
               break;
               
            case 6:
               System.out.println("Enter discipline number (1: Back Crawl, 2: Crawl, 3: Breast, 4: Butterfly):");
               int disciplineNumber = scanner.nextInt();
               competitionHandler.TopFive(disciplineNumber);
               break;
            
            case 7:
               System.out.println("Enter discipline number (1: Back Crawl, 2: Crawl, 3: Breast, 4: Butterfly):");
               int disciplineNumbers = scanner.nextInt();
               competitionHandler.getResults(disciplineNumbers);
               break; 
            
            case 8:
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