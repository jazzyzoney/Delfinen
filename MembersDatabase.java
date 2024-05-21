//Author Caroline B.

import java.util.ArrayList;
import java.time.LocalDate;
public class MembersDatabase {

    private ArrayList<Member> members;

    public MembersDatabase() {
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void printAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the database.");
        } else {
            for (Member member : members) {
                printMemberInfo(member);
               }
           }
}

     public void printMemberInfo(Member member) {
        System.out.println("Member Name: " + member.name);
        System.out.println("Phonenumber: " + member.getPhoneNumber());
        System.out.println("MemberID: " + member.getMemberId());
        System.out.println("Birthdate: " + member.getBirthDate());
        System.out.println("Age: " + member.getAge());
        System.out.println("Age type: " + member.getAgeType());
        System.out.println("Swim type: " + member.getSwimType());
        System.out.println("Aktive membership?: " + (member.getActiveMembership() ? "Ja" : "Nej"));
        System.out.println("Registrations date: " + member.getRegistrationDate());
      

     }
 
/* public void generateSomeMembers(){
    members.add(new Member("John Doe", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("Jane Doe", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("John Smith", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("Jane Smith", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("John Johnson", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("Jane Johnson", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("John Jackson", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("Jane Jackson", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("John Jensen", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
    members.add(new Member("Jane Jensen", "12345678", LocalDate.of(2000, 1, 1), true, AgeType.JUNIOR));
}
*/
 
 
 }
 
 
        
      

       








   
 
