import java.util.Scanner;


public class Main{
   public static void main (String [] args){
   
  Scanner scanner = new Scanner(System.in);
   
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