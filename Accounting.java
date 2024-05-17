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
    
     
    public int createInvoice(AdminMember adminMember, Invoice invoice){
      String memberId = adminMember.getMemberId();
      LocalDate invoiceDate = invoice.getLocalDate.now();
      //duedate
      int fee = getMembershipTypeFee(membershipType);
      Invoice invoice = new Invoice(fee, invoiceNumber, memberId, invoiceDate, dueDate);//initalize object only include attributes not types. "constructor contract" in invoice class
      invoices.add(invoice);
      invoiceNumber++;
               System.out.println("Invoice: " + invoiceNumber + memberId + fee + dueDate); //print invoice    
   } 
    
    public String getMemberId(AdminMember adminMember){ 
      return memberId;
    }
    
    public LocalDate getInvoiceDate(Invoice invoice){
         return invoiceDate;
    }
    
    public int getMembershipTypeFee(AdminMember adminMember){ //calls membershipType from adminMember Class to specific fee.        
      int fee;
      if(!member.isActive()){
      return passiveFee;

      }else {
       switch (membershipType){
         case "Junior": 
           return juniorFee();
             break;    
         case "Senior":
            return seniorFee();
            break;
         case "Over sixty!":
            return overSixtyFee();
            break;
         default: 
            System.out.println("Unknown membership type: " + membershipType);
            return 0;
            break;
      }
   }
   }

      List<invoices> findOverdueInvoices() {
         List<invoices>allInvoices = findInvoices();
            New ArrayList overdue<>
            allInvoices.forEach{
            if(overDue){
            overdueList.add
            }
            }
 
 
       //public List<Invoice> findOverdueInvoices() { 
        //List<invoice> overdues = new ArrayList<>(); //// Stores overdue invoices
         //for (Invoice invoice : invoices) { // Code to be executed FOR EACH (loop) element
            //if (invoice.isOverdue()){ //// Checks if invoice is overdue
             //  overdues.add(invoice);
        //}
       //}
        // return overdues;
   // }   
      

       public void printAllInvoices(){
         for(Invoice invoice : invoices){
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
   
   
   
   
   
 


 




