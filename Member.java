//Autor  Caroline B. 


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


   public class Member extends Person {

public int memberId;
public boolean isWoman = true;
public int ageInYears;
public LocalDate birthDate;
public boolean active;
public boolean competitive; 
public String formatted;
public String membershipType;


   public Member (int memberId, boolean isWoman, LocalDate birthDate, boolean active, boolean competitive, String membershipAgeType){
// Initializing the variables.this.id = id; 
this.memberId = memberId;
this.birthDate = birthDate;
this.active = active;
this.competitive = competitive;
this.membershipType = membershipType;

} 



}