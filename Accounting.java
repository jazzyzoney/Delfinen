//Solvej
//1)the accounting class will include: 
//2)method to create invoice(based on membershipType), 
//3)reset payment status
//4)see list of invoices in arraylist
//5)method to update payments
//6)sumMemberPayments for accruals

import java.util.ArrayList;
 //package for setting date for overdue payments
import java.util.LocalDate; //add method .now() with package 

public class Accounting{

   private static ArrayList<Invoice> overDueList = new ArrayList<>();
   
   overdueList = new ArrayList<>(); //must remain local to this class and not sent to controller

//accessing enums
//PaymentStatus status = PaymentStatus.UNPAID;
//if (status == PaymentStatus.PAID) {
//System.out.println("The invoice has been paid.");
}

   }
    //call membershipType method from adminMember Class 
   public int getmembershipFee(String membershipType){
      AdminMember adminMember = new AdminMember();
      adminMember.membershipAgeType();
    }

//2)method to create invoice(based on membershipType), 
   public int createInvoice(String membershipType, paymentStatus status, int invoiceNumber){
      invoiceNumber++;
      int fee = getMembershipFee(membershipType);
      Invoice invoice = new Invoice(PaymentStatus.NOT_OVERDUE,fee); 
      invoice.setDueDate(LocalDate.plusDays(30));
      return Invoice;    
   } 
   
   //3)reset payment status
   PaymentStatus paymentVar = PaymentStatus.OVERDUE;
   switch(paymentVar){
      case PAID:
         System.out.println("Paid");
         break;
      case UNPAID:
         System.out.println("Unpaid");
         break;
      case OVERDUE:
         System.out.println("Overdue");
         break;
      case NOT_OVERDUE:
         System.out.println("New member");
         break;

   } 
   
   
   //4)see list of invoices in arraylist
   //5)method to update payments
   public static ArrayList<Invoice> overDueInvoice() {
      ArrayList<Invoice> OverDueInvoice = new ArrayList<>();
      for (Invoice invoice : overdueInvoice) {
        if (invoice.status == PaymentStatus.OVERDUE) {
            overdue.add(invoice);
        }
         return overdue;
        }
      public static void removeOverdueInvoice(Invoice invoice) {
       overdueInvoices.remove(invoice);
      //print out list of overdue membershipfees
      public void printOverdueFee(int membershipFee, LocalDate){
      System.out.println("The following: " + membershipFees + "are overdue.");
}
}
 
