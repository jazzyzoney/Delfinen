//Author  Caroline B. 

import java.util.UUID;

public class Member extends Person {

   public String memberId;
   public boolean isWoman = true;
   public boolean active;
   public boolean competitive; 
   public String formatted;
   public String membershipType;
   
   
   public Member (){
   this.memberId = createId();
   
   }
 
 //This methods is used to create a random Member Id to a  new member of the swim club 
   private String createId() {
      var full = UUID.randomUUID();
      var fullAsString = full.toString();
      return fullAsString.substring(0,8);//generates a unique 8-character ID using UUIDs.
   }

 
 
 
  /* public Member (int memberId, boolean isWoman, LocalDate birthDate, boolean active, boolean competitive, String membershipAgeType){
   // Initializing the variables.this.id = id; 
      this.memberId = memberId;
      this.birthDate = birthDate;
      this.active = active;
      this.competitive = competitive;
      this.membershipType = membershipType;
   
   } */
   //getters
   public String getMemberId(){
      return memberId;
   }
   public boolean isWoman(){ // skal get være getIsWoman?
      return isWoman;
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
   public void setMemberId(String memberId){
    this.memberId = memberId;
   }
   public void setIsWoman(boolean isWoman){
      this.isWoman = isWoman;
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