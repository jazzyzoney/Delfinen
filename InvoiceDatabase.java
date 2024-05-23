import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class InvoiceDatabase{

   
    private final List<Invoice> invoices = new ArrayList<>();

    public void generateSomeInvoices(){
    //invoices.add(new Invoice("Pieter van Hoogenband", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 3).plusdays(2), 1, 1200, "12345", false));       
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
        System.out.println("Member Name: " + member.name());
        System.out.println("Invoice date: " + invoice.getInvoiceDate());
        System.out.println("Duedate: " + invoice.getDueDate());
        System.out.println("Invoice number: " + invoice.getInvoiceNumber());
        System.out.println("Amount due: " + invoice.getFee());
        System.out.println("MemberID: " + member.getMemberId());
        System.out.println("Payment: " + invoice.getIsPaid());
        System.out.println("*********************************************************");
        
   }
   //put  in database class
       public List<Invoice> findOverdueInvoices() { 
        List<Invoice> overdues = new ArrayList<>(); //// Stores overdue invoices 
         for (Invoice invoice : invoices) { // Code to be executed FOR EACH (loop) element
            if (invoice.isOverdue()){ //// Checks if invoice is overdue
            overdues.add(invoice);
        }
      }
         return overdues;
   }   
      
  //set to manual paid or not
      public void printOverdues(){
        List<Invoice> overdues = findOverdueInvoices();
        for (Invoice invoice : overdues){
         System.out.println(invoice.toString());  
     
     } 
 }    
}
