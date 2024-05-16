/*import java.util.ArrayList;
import java.time.localDate;*/
import java.util.Scanner;

public class Controller {

private static Scanner scanner = new Scanner(System.in);

public static void controller(){

Member member = new Member();

    System.out.println("Member name:");
    member.setName(scanner.nextLine());
    System.out.println(" Phonenumber:");
    member.setPhoneNumber(scanner.nextLine()); // evt. skrifte tili stringe, da tallet starter med 0.
    System.out.println("Member birthDate:");
    member.setBirthDate(scanner.nextLine());
    System.out.println(member.getName());
    System.out.println(member.getMemberId());
    System.out.println(member.getPhoneNumber());
    System.out.println(member.getBirthDate());
    System.out.println(member.getAge());


}
   
    
   }


/*Select function

Scanner input - choose 

1)Administrate members
a) Register new member (member info) 
b) Select disciplin
c) Search member
d) edit member
e) remove/set as inactive member
f) Add member to swimclub list
g) Show / print swimclub list

2)Accounting
a) Create new invoice
b) Search member
c) Set / reset payment status
d) Show / print invoice 

3)Competition
//a) Search member
b) Register competition results
  1) choose disciplin
  2) Register member results within each disciplin
c) Register training results
d) Show / print a list of top 5 in every disciplin




// 1) Search person
// 2) Create new member
// 3) Remove member
// 4) a) Create Invoice b) Update payment  
// 5) Enter disciplin

// 6) Enter Competition Results

}

//methods
//Try /Catch exceptions
//
*/

/* controller klassen fra pizza projektet
import java.util.*;

public class TextUI{
   static Scanner scanner = new Scanner (System.in);
   public static void textUI (){
   
      Menu.addPizzamenu();
   
      String Letters = ""; 
      
      System.out.print("Mamma mia velkommen til Mario's pizza order system!\n");
      do {
         System.out.print("\nDu har nu syv valgmuligheder:");
         System.out.println("");
         System.out.println("Du kan nu skrive [add] for at addere en ordre,");
         System.out.println("eller skrive [done] for at afslutte ordreren,");
         System.out.println("[delete] vil fjerne ordreren fra systemet,");
         System.out.println("[view] vil lade dig se alle ordrerne,");
         System.out.println("[menu] vil vise de 30 pizzaer man kan bestille,");
         System.out.println("[statistik] giver et overblik over statistikken,");
         System.out.println("[q] afslutter programmet.");
      
         Letters = scanner.next();
         switch (Letters){
         
            case "add":
               System.out.println("Du skal nu skrive hvor mange pizzaer ordreren skal indeholde: ");
               int ordernumber = scanner.nextInt();
               OrderList.addOrder(ordernumber);
               break; 
               
            case "done":
               System.out.println("Hvilken ordrer er done?");
               int sletnummer = scanner.nextInt();
               OrderList.completeOrder(sletnummer);
               System.out.println("Ordreren " + "" + sletnummer + "" + " er nu blevet markeret som done og gemt til statistikken");
               break; 
               
            case "delete":
               System.out.println("Hvilken ordrer skal slettes?");
               int deletenumber = scanner.nextInt();
               OrderList.deleteOrder(deletenumber);
               System.out.println("Ordren " + deletenumber + " er nu blevet markeret som slettet og er fjernet fra dell computeren");
               break;
               
            case "view":         
               OrderList.printOrders(OrderList.orderList, false);
               break;
               
            case "menu":
               int menuChoice;
               //loop in menu case
               do {
                  System.out.println("\nHvilken side af menuen vil du se? (1, 2, eller 3)");
                  menuChoice = scanner.nextInt();
                  Menu.addPizzamenu();
                  Menu.pizzaMenuCard(menuChoice);
               
                  System.out.println("\nVil du se en anden side? (y/n)");
               } while (scanner.next().equalsIgnoreCase("y"));
               break;
               
            case "statistik":
               Statistics.loadsavefile();
               if (Statistics.fileDoesNotExist == true){
                  System.out.println("Der er ikke nogen gemte ordre.");
                  Statistics.fileDoesNotExist = false;
                  break;
               }else{
               
                  System.out.println("Vil du se 1: omsaetningen, eller 2: mest populaere pizza");
                  stats();
                  break;
               }
            
            case "q":
               System.out.println("Tak for idag :)");
               System.exit(0);        
         }
      } while(true);
   }
   
   public static void stats(){
      int Numbers = 0;
      Numbers = scanner.nextInt();
      Statistics.mostSold();
      switch (Numbers){
                  
         case 1:
            do {
               System.out.println(Statistics.totalTurnover());
            
               System.out.println("\nVil du tilbage? (y/n)");
            } while (scanner.next().equalsIgnoreCase("n"));
            break;
            
         case 2:
            do {
               System.out.println(Menu.menu.get(Statistics.mostSoldPizza).name + " (" + Statistics.maxSold + ") ");
                     
               System.out.println("\nVil du tilbage? (y/n)");
            } while (scanner.next().equalsIgnoreCase("n"));
            break;
      }
   }
}
*/
