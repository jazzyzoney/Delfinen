//Author Caroline B.

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class MembersDatabase {

    private List<Member> members;

    public MembersDatabase() {
        members = new ArrayList<>();
    }
    
    public void generateSomeMembers(){
    members.add(new Member("John Doe", "12345678", LocalDate.of(2012, 1, 1), SwimType.COMPETITIVE, true));
    System.out.println("***********************************************************************************");
    members.add(new Member("Jane Doe", "12345678", LocalDate.of(1945,1, 11),SwimType.COMPETITIVE, true));
    members.add(new Member("John Smith", "12345678", LocalDate.of(1956,1, 12),SwimType.COMPETITIVE, true));
    members.add(new Member("James Smith", "12345678", LocalDate.of(1967,8, 12),SwimType.COMPETITIVE, true));
    members.add(new Member("Johan Johnson", "12345678", LocalDate.of(2021, 10, 11),SwimType.COMPETITIVE, true));
    members.add(new Member("Johanne Johnson", "12345678", LocalDate.of(1999, 1, 10),SwimType.COMPETITIVE, true));
    members.add(new Member("Jo Jackson", "12345678", LocalDate.of(2010, 07, 1),SwimType.COMPETITIVE, true));
    members.add(new Member("Jan Jackson", "12345678", LocalDate.of(2011,06, 1),SwimType.COMPETITIVE, true));
    members.add(new Member("Jojo Jensen", "12345678", LocalDate.of(1867, 04, 1), SwimType.COMPETITIVE,true));
    members.add(new Member("Jaja Jensen", "12345678", LocalDate.of(2000, 1, 1), SwimType.COMPETITIVE, true));
}

    public void addMember(Member member) {
        members.add(member);
    }
    
    public List<Member> getMembers() {
        return members;
    }

   /* public void printAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the database.");
        } else {
            for (Member member : members) {
                printMemberInfo(member);
               }
           }
}*/
public void printAllMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

     /*public void printMemberInfo(Member member) {
        System.out.println("*********************************************************");
        System.out.println("Member Name: " + member.name);
        System.out.println("Phonenumber: " + member.getPhoneNumber());
        System.out.println("MemberID: " + member.getMemberId());
        System.out.println("Birthdate: " + member.getBirthDate());
        System.out.println("Age: " + member.getAge());
        System.out.println("Age type: " + member.getAgeType());
        System.out.println("Swim type: " + member.getSwimType());
        System.out.println("Aktive membership?: " + (member.getActiveMembership() ? "Ja" : "Nej"));
        System.out.println("Registrations date: " + member.getRegistrationDate());
        System.out.println("*********************************************************");

     }*/
     
 public void printMemberInfo(Member member) {
        System.out.println(member);
    }

 
 
 }
 
 
        
      

       








   
 
