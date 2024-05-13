
//import java.util.LocalDate; 
//add method .now() with package 

public class Invoice {
//Invoice class includes fee amounts, payment status, invoice nr, maybe duedate  
    
   //private LocalDate dueDate;
   private static int invoiceNumber = 0;
   private PaymentStatus status;
   
   private int juniorFee = 1000; //cost of membership for junior swimmer
   private int seniorFee = 1600; //cost of membership for +18 swimmer
   private int overSixtyFee = 1200; //Cost of membership for +60 swimmers
   private int passiveFee = 500; // cost of passive membership
   
   public Invoice(int juniorFee, int seniorFee, 
   int overSixtyFee, int passiveFee, PaymentStatus status){
   this.juniorFee = juniorFee;
   this.seniorFee = seniorFee;
   this.overSixtyFee = overSixtyFee;
   this.passiveFee = passiveFee;
   this.status = status;
   //this.dueDate = LocalDate.now();
   invoiceNumber++;

       }   
      // public void setDueDate(LocalDate newDueDate){
         //this.dueDate = newDueDate;
       public int getInvoiceNumber(){
         return invoiceNumber;
       }
       
       public int getJuniorFee(){
         return juniorFee;
       }
       
       public int getSeniorFee(){
         return seniorFee;
       }
       public int getOverSixtyFee(){
         return overSixtyFee;
       }
       public int getPassiveFee(){
         return passiveFee;
       }

       public enum PaymentStatus {
         PAID,
         UNPAID, 
         OVERDUE,
         NEWMEMBER     
      }
      
 
}

