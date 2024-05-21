//Solvej (author)
 
import java.time.LocalDate; 

public class Invoice {

   private LocalDate invoiceDate = LocalDate.now();
   private LocalDate dueDate = invoiceDate.plusDays(2);
   private boolean isPaid;
   private int invoiceNumber;
   private int fee = 0;
   private String memberId; 
   
   
   public Invoice(LocalDate invoiceDate, LocalDate dueDate, int invoiceNumber, int fee, String memberId, boolean isPaid){
   this.invoiceDate = invoiceDate;
   this.dueDate = dueDate;
   this.fee = fee;
   this.invoiceNumber = invoiceNumber;
   this.memberId = memberId;
   this.isPaid = isPaid;
   
       }   
        
       public LocalDate getInvoiceDate(){
         return invoiceDate;
       }
    
     public LocalDate getDueDate(){
         return dueDate;
       }
     
     public boolean getIsPaid(){
      return isPaid;
   }
     
     public void setIsPaid(boolean isPaid){
     this.isPaid = isPaid;
     }
     
 
     public Boolean isOverdue(){  
      LocalDate today = LocalDate.now(); 
       if (today.isAfter(dueDate) && isPaid == false){ //if today is after the due date of the object AND it is NOT PAID YET
       return true; // then returns true. Because the question is, is it overdue?
       }
       return false;
     }   
    
      
}
       
       
         