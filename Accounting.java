
//Solvej

import java.util.ArrayList;
 //package for setting date for overdue payments
import java.util.LocalDate; //add method .now() with package 

public class Accounting{

   private ArrayList<Overdue> overdueList;
   private int juniorFee = 1000; //cost of membership for junior swimmer
   private int seniorfee = 1600; //cost of membership for +18 swimmer
   private int overSixtyFee = 1200; //Cost of membership for +60 swimmers
   private int passiveFee = 500; // cost of passive membership
   private boolean isOverdue = true; //variable to check if payment is in arrears/overdue
   private boolean isPaid = true; //variable to check if payment received
   private static int invoiceNumber = 0; //invoice number
   
   
   
   //constructor to initialize variables
   //initialized so that fee can updated/increased later 
   public Accounting(int juniorFee, int seniorFee, 
   int overSixtyFee, int passiveFee){ //variables that will called upon in controller
   
   overdueList = new ArrayList<>(); //must remain local to this class and not sent to controller
   this.juniorFee = juniorFee;
   this.seniorFee = seniorFee;
   this.overSixtyFee = overSixtyFee;
   this.passiveFee = passiveFee;
   this.isOverdue = false; //invoice not overdue yet upon creation
   this.isPaid = false; //invoice not paid yet upon creation
  
   }
   
   public int membershipFee(){//method to find fee according to type of membership
      return membershipFee;
   }
   
   public int createInvoice(membershipFee, isActive, invoiceNumber){
      invoiceNumber++;
      return createInvoice; //method to create invoice according to membership, whether active or not, plus memberID
   }
   
   public void PrintPaymentDue(membershipFee, LocalDate, invoiceNumber){
      System.out.println("Your payment of: " + invoiceNumber + " : " + membershipFee + "is due: " + LocalDate);
   }
   
   public void printOverdueFee(membershipFee, LocalDate){
      System.out.println("The following: " + membershipFee + "is overdue.");
   }
   



