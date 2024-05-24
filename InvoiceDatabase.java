import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class InvoiceDatabase{

    public List<Invoice> invoices;
    
    public InvoiceDatabase() {
     invoices = new ArrayList<>();
    
    }
     
    //public List<Invoice> invoices = new ArrayList<>();

    public void generateSomeInvoices(){ 
 
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 1, 500, "480fd92g", true));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 2, 1200, "480fd92h", true));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 5, 1600, "480fd92s", true));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 5, 1200, "480fd92p", false));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 6, 1600, "480fd92t", true));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 7, 1200, "480fd92x", false));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 8, 500, "480fd92v", false));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 9, 500, "480fd922", false));
        invoices.add(new Invoice(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 01, 01).plusDays(2), 10, 1200, "480fd923", false));
        
         
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
