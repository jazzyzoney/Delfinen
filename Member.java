//Author  Caroline B. 
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

enum AgeType {
    JUNIOR, SENIOR, OVERSIXTY

}
/*enum AgeType {
    JUNIOR("Under 18 years"),
    SENIOR("Over 18 years "),
    OVERSIXTY("Over 60 years");

    private final String description;

    AgeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}*/

enum SwimType {
    COMPETITIVE, NONCOMPETITIVE
}

enum swimTeam {
    JUNIOR, SENIOR
}

public class Member {

   public String name;//console input
   public String phoneNumber;//console input - husk try-catch til antal cifre. Forlang 8.
   private String memberId; // calculated 
   private LocalDate birthDate; //console input
   private int age; // calculated
   private AgeType ageType; //calculated from birthDate in constructor
   private SwimType swimType; //console input
   private boolean activeMembership; //console input
   private String registrationDate; //calculated from LocalDate.now() in constructor
   private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
   //private String formattedBirthDate; 
    

    //constructor
    public Member(String name, String phoneNumber, LocalDate birthDate, SwimType swimType, boolean activeMembership) {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.memberId = createId();
        this.birthDate = birthDate;
        this.age = ageCalculator();
        this.ageType = calculateAgeType();
        this.swimType = swimType; 
        this.activeMembership = activeMembership;
        this.registrationDate = LocalDate.now().format(DATE_FORMATTER);
        
        //this.formattedBirthDate = birthDate.format(DATE_FORMATTER);
        

        }
   
 //This methods is used to create a random MemberId to a  new member of the swim club 
   private String createId() {
      var full = UUID.randomUUID();
      var fullAsString = full.toString();
      return fullAsString.substring(0,8);//generates a unique 8-character ID using UUIDs.
   }
   
/*This calculates the ageType from the birthDate. 
      private int calculateAge(LocalDate birthDate) {
      LocalDate today = LocalDate.now();
      return Period.between(getBirthDate(),today).getYears();
      } */
      
      public int ageCalculator() {
        LocalDate today = LocalDate.now();
        age = Period.between(getBirthDate(), today).getYears();
        return age;        }
                
  /*public void format() {
  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  format = birthDate.format(format);
}*/
      
      // This method calculates the ageType from the birthDate
  
  
   private AgeType calculateAgeType() {
      int age = ageCalculator();
      if (age < 18) {
          return AgeType.JUNIOR;
      } else if (age >= 60) {
          return AgeType.OVERSIXTY;
      } else {
          return AgeType.SENIOR;
      }
   }


  //Getters

public String getName(){
  return name;
  }

public String getPhoneNumber(){
    return phoneNumber;
    
} 
   public LocalDate getBirthDate(){
      return birthDate;
   }
   
   public int getAge(){
   return age;
   
   }

   public String getMemberId(){
      return memberId;
   }

   public boolean getActiveMembership(){
      return activeMembership;
   }
  AgeType getAgeType(){
  return ageType;
   }
  
  //public String getFormattedBirthDate() {
       // return formattedBirthDate;
   // }
    
    //Method to get registration date
   public String getRegistrationDate() {
        return LocalDate.now().format(DATE_FORMATTER);
    }
 
   public SwimType getSwimType() {
      return swimType;
      }
   
    
   //Setters
   
public void setName ( String name){
   this.name = name;
   }

public void setPhoneNumber(String phoneNumber){
     this.phoneNumber = phoneNumber;
}

public void setBirthDate(String birthDate){
      this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
     
   }

   public void setMemberId(String memberId){
    this.memberId = memberId;
  }

  /* public void setFormatted(String formatted){
      this.formattedBirthDate = formattedBirthDate;
   }*/
   
   public void setSwimType(SwimType swimType){
      this.swimType = swimType;
   }
   
   

 } 



    

