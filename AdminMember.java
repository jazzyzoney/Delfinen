//Author Caroline B.
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class AdminMember extends Member{

   public ArrayList<Member> clubMembers = new ArrayList<>(); //liste over klubmedlemmer
 
   /*public AdminMember(String memberID, String name, LocalDate birthDate, int phoneNumber, String membershipType, boolean active) {
      this.memberId = memberId;
      this.name = name;
      this.birthDate = birthDate;
      this.phoneNumber = phoneNumber;
      this.membershipType = membershipType;
      this.active = active;
   }*/
   
   public void showClubMembers(){ //for at printe listen med klubbens medlemmer 
      for(Member member : clubMembers){
         System.out.println("Member ID: " + member.getMemberId());
         System.out.println("Name: " + member.getName());
         System.out.println("Gender: " + member.isWoman());
         System.out.println("Age: " + member.getAge());
         System.out.println("Membershiptype: " + member.getMembershipType());
         System.out.println("Active/Passive: " + member.isActive());
         System.out.println("Competive: " + member.isCompetitive());
      }
   }

 
       public void format() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      formatted = birthDate.format(format);
   }

        
//This sets the membership type after age
   public void membershipAgeType() {
      int age = ageCalculator(); // to calculate the age first. 
      if (age < 18) {
         this.membershipType = "Junior";
      } else if (age >= 18 && age <= 60) {
         this.membershipType = "Senior";
      } else if (age > 60) {
         this.membershipType = "overSixtyFee";
      }
   }
   
   
   public void removeClubMembers() {
   
   
   
   }
   public void editClubMembers(){
   
   
   }
   
   public void searchClubMembers(){
   
   
   }
}


//Edit, delete og  find member metode. 




// skal flyttes til files:

/*public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        format();
        ageCalculator();
        membershipAgeType();
    }*/
    
    /*public class MemberList {
    private ArrayList<Member> members;

    public void removeMembersByCondition(Predicate<Member> condition) {
        members.removeIf(condition);
        System.out.println("Removed members matching the condition.");
    }
}*/

/*try - catch*/  