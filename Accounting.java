//Author Solvej T.
//Accounting 
//1)Lists fees
//2)Creates invoice with membershipTypeFee
//3)Adds invoice to Invoices ArrayList
//4)Sets/resets payment status via ArrayList
//5)Prints invoices


import java.util.List;
import java.util.ArrayList; //to create list of invoices
import java.time.LocalDate; //to set invoice dueDATE

public class Accounting{
  
    private final List<invoices> = new ArrayList<>();
    
    private int juniorFee = 1000; //cost of membership for junior swimmer
    private int seniorFee = 1600; //cost of membership for +18 swimmer
    private int overSixtyFee = 1200; //Cost of membership for +60 swimmers
    private int passiveFee = 500; // cost of passive membership
   //create constructor with fees and without    
   
    public Accounting(int juniorFee, int seniorFee, 
    int overSixtyFee, int passiveFee){
      this.juniorFee = juniorFee;
      this.seniorFee = seniorFee;
      this.overSixtyFee = overSixtyFee;
      this.passiveFee = passiveFee;
    }
    
    public Accounting(){
    //blank constructor needed here, but do I need to initialize categories as well?
    }
     
    public int createInvoice(String membershipType, paymentStatus status,//method to create invoice 
      int invoiceNumber){
      var invoice = new Invoice(memberId, fee)
      invoices.add(invoice);
      //invoices.edit(invoice);
      invoiceNumber++;
      int fee = getMembershipFee(membershipType);
         System.out.println("Invoice: " + invoiceNumber + fee); //print invoice    
   } 
   
     public boolean removeInvoice(Invoice invoice){
      if (invoices.contains(invoice)) {
         invoices.remove(invoice);
         return true;
      } else {
         return false;   
      }
      }

    public void printInvoices(){ //print invoices? Or create option for printing active invoices?
      for(var invoice : invoice){
        invoice.print();
      }
    }
   
    public int getMembershipFee(Member member){ //calls membershipType from adminMember Class.       
      Invoice invoice = new Invoice();          //Connects type to fee
      int fee;
      if(!member.isActive()){
      return passiveFee;

      }else {
       switch (membershipType){
         case "Junior": 
            return Invoice.getJuniorFee();
         case "Senior":
            return Invoice.getSeniorFee();
         case "Over sixty!":
            return Invoice.getOverSixtyFee();
         default: 
            System.out.println("Unknown membership type: " + membershipType);
            return 0;
      }
   }
   }
      public void invoiceDate(){
         return invoiceDate();
   }

      public void dueDate(){
         return dueDate();
   }

      public void invoiceNumber(){
        Invoice inNBR = new Invoice();
         int inNBR = inNBR.getInvoiceNumber(); 
    }

      public void payStatus(PaymentStatus paymentStatus){ //method to select pay status 
         switch(paymentStatus){                          
            case PAID:
               System.out.println("Paid");
               break;
            case UNPAID:
               System.out.println("Unpaid");
               break;
            case OVERDUE:
               System.out.println("Overdue");
               break;
            case NEWMEMBER:
               System.out.println("New member");
               break; 
             default: 
                System.out.println("Invalid payment status");
             }
           }      
      
      public static ArrayList<Invoice> overDueInvoice() { //method to find invoices in arrears 
      ArrayList<Invoice> OverDueInvoice = new ArrayList<>();
         for (Invoice invoice : overdueInvoice) { // Code to be executed FOR EACH (loop) element
            if (invoice.status == PaymentStatus.OVERDUE) {
               overdue.add(invoice);
        }
         return overdue;
        }
         
   }
   }
   
   
 


 




