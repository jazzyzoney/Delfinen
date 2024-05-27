//Solvej T. (author)
 
import java.time.LocalDate; 

public class Invoice { //invoice contract, model, template

   private LocalDate invoiceDate = LocalDate.now();
   private LocalDate dueDate = invoiceDate.plusDays(2);
   private boolean isPaid;
   private int invoiceNumber;// calculated in accounting.
   private int fee = 0; // calculated in accounting.
   private String memberId; //calculated in Member class. 
  
  //Constructor
   
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
      
      public int getFee(){
       return fee;
      }
      
      public int getInvoiceNumber(){
       return invoiceNumber;
      }
      
      public String getMemberId(){
         return memberId;
      }
    
     
     public boolean getIsPaid(){
      return isPaid;
   }
     
     public void setIsPaid(boolean isPaid){
     this.isPaid = isPaid;
     }
     //Method called in invoiceDatabase. 
     @Override
     public String toString() {
     return "Invoice [memberId=" + memberId + ", fee=" + fee + ", invoiceDate=" + invoiceDate +
         ", dueDate=" + dueDate + ", invoiceNumber=" + invoiceNumber + ", isPaid=" + isPaid + "]";
     }
     //Method to calculated members in arrears invoiceDatabase.
     public Boolean isOverdue(){
       LocalDate today = LocalDate.now();
       if(today.isAfter(dueDate) && isPaid == false){
       return true;
       }
       System.out.println("Not paid");
       return false;  
       }          
   }         

           
       