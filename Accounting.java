//Author Solvej T.

import java.util.List;
import java.util.ArrayList; //to create list of invoices
import java.time.LocalDate; //to set invoice date

public class Accounting{
  
    private final ArrayList<Invoice> invoices = new ArrayList<>();
 
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
    
    public int createInvoice(Member member){
      String memberId = member.getMemberId();
      LocalDate invoiceDate = LocalDate.now();
      int fee = getMembershipTypeFee(member);
      
      LocalDate dueDate = invoiceDate.plusDays(30);
      
      Invoice invoice = new Invoice(fee, invoiceNumber, memberId, invoiceDate, dueDate);//initalize object only include attributes not types. "constructor contract" in invoice class
      invoices.add(invoice);
      invoiceNumber++;
               System.out.println("Invoice number: " + invoiceNumber);
               System.out.println("Date of invoice: " + invoiceDate);
               System.out.println("MemberId: " + memberId);
               System.out.println("Duedate: " + invoice.getInvoiceDueDate); 
               System.out.println("Membership fee: " + fee);              
   } 
    
    public String getMemberId(Member member){ 
      return memberId;
    }
    
    public LocalDate getInvoiceDate(Invoice invoice){
         return invoiceDate;
    }
    
    public LocalDate getDueDate(Invoice invoice){
         return dueDate;
    }
    
    //private int getAgeTypeFee(Member member){ //calls membershipType from adminMember Class to specific fee.        
      //String AType = member.getAgeType();
      
      int fee;
      if(!member.isActive()){
      return passiveFee;

      }//else {
       switch (membershipType){
         case "Junior": 
           return juniorFee;
             break;    
         case "Senior":
            return seniorFee;
            break;
         case "Over sixty":
            return overSixtyFee;
            break;
         default: 
            System.out.println("Unknown membership type: " + membershipType);
            return 0;
            break;
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
      

       public void printAllInvoices(){
         for (Invoice invoice : invoices){
         invoice.print();
      }
   }
      
      public void printOverdues(){
        List<Invoice> overdues = findOverdueInvoices();
        
        for (Invoice invoice : overdues){
         invoice.print();
       
     } 
 }
 } 
   
   
   
   
 


 




