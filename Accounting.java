//Author Solvej T.

import java.util.List;
import java.util.ArrayList; //to create list of invoices
import java.time.LocalDate; //to set invoice date

public class Accounting{
  
    private final List<Invoice> invoices = new ArrayList<>();
 
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
      String memberId = member.getMemberId();
      LocalDate invoiceDate = LocalDate.now();
      int fee = getMemberTypeFee(member);
      LocalDate dueDate = invoiceDate.plusDays(2); //set it to 2 days to show in presentation
            
      Invoice invoice = new Invoice(invoiceDate, dueDate, invoiceNumber, fee, memberId, false);//initalize object only include attributes not types. "constructor contract" in invoice class
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
   
       public List<Invoice> findOverdueInvoices() { 
        List<Invoice> overdues = new ArrayList<>(); //// Stores overdue invoices 
         for (Invoice invoice : invoices) { // Code to be executed FOR EACH (loop) element
            if (invoice.isOverdue()){ //// Checks if invoice is overdue
            overdues.add(invoice);
        }
      }
         return overdues;
   }   
      
  
      public void printOverdues(){
        List<Invoice> overdues = findOverdueInvoices();
        for (Invoice invoice : overdues){
         System.out.println(invoice.toString());  
     
     } 
 }
 } 
   
   
   
   
 


 




