//Author  Caroline B. 
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

enum AgeType {
    JUNIOR, SENIOR, SENIORMINUS25
}

enum SwimType {
    COMPETITIVE, NONCOMPETITIVE
}

enum swimTeam {
    JUNIOR, SENIOR
}

public class Member {

   public String name;//console input
   private String phoneNumber;//console input - husk try-catch til antal cifre. Forlang 8.
   private String memberId; // calculated 
   private LocalDate birthDate; //console input
   private int  age; // calculated
   private AgeType ageType; //calculated from birthDate in constructor
   private SwimType swimType; //console input
   private boolean activeMembership; //console input
   private String registrationDate; //calculated from LocalDate.now() in constructor
   private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    
    //constructor
    public Member(String name, String phoneNumber,String memberId, LocalDate birthDate, boolean activeMembership,AgeType ageType,String registrationDate) {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.memberId= createId();;
        this.birthDate = birthDate;
        this.age = age;
        this.ageType = ageType; 
        this.activeMembership = activeMembership;
        this.registrationDate = LocalDate.now().format(DATE_FORMATTER);
       /* this.formattedBirthDate = birthDate.format(DATE_FORMATTER);
        */
        }
   
 //This methods is used to create a random MemberId to a  new member of the swim club 
   private String createId() {
      var full = UUID.randomUUID();
      var fullAsString = full.toString();
      return fullAsString.substring(0,8);//generates a unique 8-character ID using UUIDs.
   }
   
//This calculates the ageType from the birthDate. 
      private int calculateAge(LocalDate birthDate) {
      LocalDate today = LocalDate.now();
      return Period.between(getBirthDate(),today).getYears();
      } 
      
      public void ageCalculator() {
        LocalDate today = LocalDate.now();
        age = Period.between(birthDate, today).getYears();
        
        }
   /*    public void format() {
   
   DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
   format = birthDate.format(format);
}*/
      
      // This method calculates the ageType from the birthDate
   private AgeType calculateAgeType(LocalDate birthDate) {
      int age = calculateAge(birthDate);
      if (age < 18) {
          return AgeType.JUNIOR;
      } else if (age >= 60) {
          return AgeType.SENIORMINUS25;
      } else {
          return AgeType.SENIOR;
      }
   }
public void print() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        
       
        
        System.out.println("Active Membership: " + activeMembership);
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
   /*public String getFormattedBirthDate() {
        return formattedBirthDate;
    }*/
   // Method to get formatted registration date
    public String getFormattedRegistrationDate() {
        return LocalDate.now().format(DATE_FORMATTER);
    }
 
   public SwimType getSwimType(){
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

   /*public void setFormatted(String formatted){
      this.formattedBirthDate = formattedBirthDate;
   }*/
   
   public void setSwimType(SwimType swimType){
      this.swimType = swimType;
   }
   
  } 

  



  
/*Member member = new Member();

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
    System.out.println(member.getMembershipType());*/
    

