import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class InvoiceDatabase{

    private final List<Invoice> invoices = new ArrayList<>();

    public void addInvoices(Invoice invoice){ 
    invoices.add(invoice);      
  }

    public void generateSomeInvoices(){ 
  } 
  
    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
  }
     
    public List<Invoice> getInvoices() {
       return invoices;
    }
     
    public void printAllInvoices() {
     if (invoices.isEmpty()) {
        System.out.println("No invoices in the database.");
     } else {
       for (Invoice invoice : invoices) {
          printInvInfo(invoice);
       }
     }
     }

     public void printInvInfo(Invoice invoice) {
        
        System.out.println("*********************************************************"); 
        //System.out.println("Member Name: " + member.name());
        System.out.println("Invoice date: " + invoice.getInvoiceDate());
        System.out.println("Duedate: " + invoice.getDueDate());
        System.out.println("Invoice number: " + invoice.getInvoiceNumber());
        System.out.println("Amount due: " + invoice.getFee());
        System.out.println("MemberID: " + invoice.getMemberId());
        System.out.println("Payment: " + invoice.getIsPaid());
        System.out.println("*********************************************************");
        
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
