//Author Solvej T.

import java.util.List;
import java.util.ArrayList; //to create list of invoices
import java.time.LocalDate; //to set invoice date

public class Accounting{
    
   private int juniorFee = 1000;
   private int seniorFee = 1600; 
   private int overSixtyFee = 1200; 
   private int passiveFee = 500;  
   private int invoiceNumber = 0; 
   private LocalDate invoice;
   private LocalDate invoiceDate = LocalDate.now();//calculated 
   private LocalDate dueDate = invoiceDate.plusDays(2); // calculated 
     
     //Constructor  
   public Accounting(int juniorFee, int seniorFee, int overSixtyFee, int passiveFee, LocalDate invoice){
      this.juniorFee = juniorFee;
      this.seniorFee = seniorFee;
      this.overSixtyFee = overSixtyFee;
      this.passiveFee = passiveFee;
      this.invoice = invoice;
      this.invoiceDate=invoiceDate;
      this.dueDate=dueDate; 
   }
    
   public Accounting(){
     
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
    
   public Invoice createInvoice(Member member){
    
      LocalDate invoiceDate = LocalDate.now();
      LocalDate dueDate = invoiceDate.plusDays(2); //2 days is just a general number set after an invoice date. 
      int fee = getMemberTypeFee(member);
   
      InvoiceDatabase db = new InvoiceDatabase(); //db is the new identifier.  
   
      Invoice invoice = new Invoice(invoiceDate, dueDate, invoiceNumber, fee, member.getMemberId(), false);//initalize object only include attributes not types. "constructor contract" in invoice class
      db.addInvoice(invoice);
      invoiceNumber++;
               
      System.out.println("Invoice number: " + invoiceNumber);
      System.out.println("Date of invoice: " + invoiceDate);
      System.out.println("MemberId: " + member.getMemberId());
      System.out.println("Duedate: " + dueDate); 
      System.out.println("Membership fee: " + fee);            
      return invoice;
   } 
        
   public int getMemberTypeFee(Member member){ //Enum ageType.           
      
      if(!member.isActiveMembership()){
         return passiveFee;
      } 
      AgeType ageType = member.getAgeType();
   
      switch (ageType){
         case JUNIOR: 
            return juniorFee; 
           //break;  
         case SENIOR:
            return seniorFee;
            //break;
         case OVERSIXTY:
            return overSixtyFee;
            //break;
         default: 
            System.out.println("Unknown membership type.");       
            return 0;
      }
   }
} 
 
 
  
   
   
   
 


 



                
