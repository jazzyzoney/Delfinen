//Author Solvej T.

import java.util.List;
import java.util.ArrayList; //to create list of invoices
import java.time.LocalDate; //to set invoice date

public class Accounting{
  
   
 
    private int juniorFee = 1000; //cost of membership for junior swimmer
    private int seniorFee = 1600; //cost of membership for +18 swimmer
    private int overSixtyFee = 1200; //Cost of membership for +60 swimmers
    private int passiveFee = 500; // cost of passive membership 
    private int invoiceNumber = 0; 
    
       
    public Accounting(int juniorFee, int seniorFee, int overSixtyFee, int passiveFee){
      this.juniorFee = juniorFee;
      this.seniorFee = seniorFee;
      this.overSixtyFee = overSixtyFee;
      this.passiveFee = passiveFee;
    }
    
    public int getJuniorFee() {
        return juniorFee;
    }

    public int getSeniorFee() {
        return seniorFee;
    }

    public int getOverSixtyFee() {
        return overSixtyFee;
    }

    public int getPassiveFee() {
        return passiveFee;
    }
    
    public Invoice createInvoice(Member member){
      //String name = member.getName();
      LocalDate invoiceDate = invoice.LocalDate.now();
      LocalDate dueDate = invoiceDate.plusDays(2); //set it to 2 days to show in presentation
      int fee = getMemberTypeFee(member);


      //add name to invoice object  
      Invoice invoice = new Invoice(invoiceDate, dueDate, invoiceNumber, fee, member.getMemberId(), false);//initalize object only include attributes not types. "constructor contract" in invoice class
      invoices.add(invoice);
      invoiceNumber++;
               
               System.out.println("Invoice number: " + invoiceNumber);
               System.out.println("Date of invoice: " + invoiceDate);
               System.out.println("MemberId: " + memberId);
               System.out.println("Duedate: " + dueDate); 
               System.out.println("Membership fee: " + fee);            
               return invoice;
   } 
        
    public int getMemberTypeFee(Member member){ //calls ageType from adminMember Class to specific fee.           
      
      if(!member.getActiveMembership()){
      return passiveFee;
   } 
    AgeType ageType = member.getAgeType();
   
       switch (ageType){
         case JUNIOR: 
           return juniorFee; 
           //break;  
         case SENIOR:
            return seniorFee;
            //break;
         case OVERSIXTY:
            return overSixtyFee;
            //break;
         default: 
            System.out.println("Unknown membership type.");       
            return 0;
      }
   }
   
 } 
   
   
   
   
 


 



            // Accountant
            case 3:
               System.out.println("Register a payment");
               
               System.out.println("Enter member name:");
               String name = scanner.nextLine();
              
               membersDatabase.getMembers();
               
               Accounting.createInvoice(member); 
               
             //invoiceNumber, invoiceDate, fee, isPaid);
             //int fee = accounting.getMemberTypeFee(member);       
        
            public boolean printReceipt(){
               if (!printReceipt) 
                Scanner receiptScan = new Scanner(System.in);  
                System.out.println("Would you like to print a receipt? (y/n)");
                String userInput = scanner.nextLine().toLowerCase;
          }
            while (userInput.equals("y")) { 
              System.out.println("Member name: " + name);
              System.out.println("MemberId: " + memberId);
              System.out.println("InvoiceNumber: " + invoiceNumber);
              System.out.println("Payment date: " + invoiceDate);
              System.out.println("Amount paid: " + fee);
              
                return true;
          } else { (userInput.equals("n"){
            
            System.out.println("Receipt canceled.");
               return false;
          }
        }
      }
        
            break;
        
        case 4:
               accounting.printOverdues(){
               System.out.println(invoice.toString());
                    break;  
       }                                                  
 }
     
