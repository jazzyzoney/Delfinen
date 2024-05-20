//Solvej (author)
//Invoice class includes payment status, invoice date and due date  
import java.time.LocalDate; 

public class Invoice {

   private LocalDate invoiceDate = LocalDate.now();
   private LocalDate dueDate = invoiceDate.plusDays(30);
   private boolean isPaid = false;
 
   public Invoice(LocalDate invoiceDate, LocalDate dueDate, boolean paid){
   this.invoiceDate = invoiceDate;
   this.dueDate = dueDate;
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
     
 
     public Boolean isOverdue(){  // method
      LocalDate today = LocalDate.now(); // find localdate method .now
       if (today.isAfter(dueDate) && isPaid == false){ //if today is after the due date of the object AND it is NOT PAID YET
       return true; // then returns true. Because the question is, is it overdue?
       }
       return false;
     }   
     
     
}
       
       
         