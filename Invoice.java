//Solvej (author)
//Invoice class includes payment status, invoice date and due date  
import java.time.LocalDate; 

public class Invoice {

   private PaymentStatus status;
   private LocalDate invoiceDate = LocalDate.now();
   private LocalDate dueDate = invoiceDate.plusDays(30);
   //add 60 days rule? Exit member.
 
   public Invoice(PaymentStatus status, LocalDate invoiceDate, LocalDate dueDate){
   this.status = status;
   this.invoiceDate = invoiceDate;
   this.dueDate = dueDate;
   
       }   
        
       public LocalDate getInvoiceDate(){
         return invoiceDate;
         }
         
       public LocalDate getDueDate(){
         return dueDate;
       
       }

       public enum PaymentStatus {
         PAID,
         UNPAID, 
         OVERDUE,
         NEWMEMBER     
      } 
    }
      
//include print invoice method?

