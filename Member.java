//Author  Caroline B. 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member extends Person {

   public int memberId;
   public boolean isWoman = true;
   public int age;
   public LocalDate birthDate;
   public boolean active;
   public boolean competitive; 
   public String formatted;
   public String membershipType;
 
  /* public Member (int memberId, boolean isWoman, LocalDate birthDate, boolean active, boolean competitive, String membershipAgeType){
   // Initializing the variables.this.id = id; 
      this.memberId = memberId;
      this.birthDate = birthDate;
      this.active = active;
      this.competitive = competitive;
      this.membershipType = membershipType;
   
   } */
   //getters
   public int getMemberId(){
      return memberId;
   }
   public boolean isWoman(){ // skal get være getIsWoman?
      return isWoman;
   }
   public int getAge(){
   return age;
   }
   public LocalDate getBirthDate(){
      return birthDate;
   }
   public boolean isActive(){
      return active;
   }
   public boolean isCompetitive(){
      return competitive;
   }
   public String getFormatted(){
      return formatted;
   }
   public String getMembershipType(){
      return membershipType;
   }
   //setters
   public void setMemberId(int memberId){
    this.memberId = memberId;
   }
   public void setIsWoman(boolean isWoman){
      this.isWoman = isWoman;
   }
   public void setBirthDate(String birthDate){
      this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
   }
   public void setActive(boolean active){
      this.active = active;
   }
   public void setCompetitive(boolean competitive){
      this.competitive = competitive;
   }
   public void setFormatted(String formatted){
      this.formatted = formatted;
   }
   public void setMembershipType(String membershipType){
      this.membershipType = membershipType;
   }
}