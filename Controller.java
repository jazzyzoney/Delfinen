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