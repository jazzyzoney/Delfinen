//Author Caroline B.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class AdminMember extends Member{



 public AdminMember(String memberID, String name, LocalDate birthDate, int phoneNumber, String membershipType, boolean active) {
        this.memberId = memberId;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.membershipType = membershipType;
        this.active = active;
}


 //This methods is used to create a random Member Id to a  new member of the swim club 
    private String createId() {
        var full = UUID.randomUUID();
        var fullAsString = full.toString();
        return fullAsString.substring(0,8);//generates a unique 8-character ID using UUIDs.
    }

    //This calculates the age of the member
    public void ageCalculator() {
        LocalDate today = LocalDate.now();
        this.getAge = Period.between(birthDate, today).getAge();
        
          // LocalDate skal løses mht. datatype og hvilken variable der skal bruges i denne metode
    }
        public void format() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formatted = birthDate.format(format);
    }

        
//This sets the membership type after age
        public void membershipAgeType() {
        ageCalculator(); // to calculate the age first. 
    if (age < 18) {
        this.membershipType = "Junior";
    } else if (age >= 18 && ageInYears <= 60) {
        this.membershipType = "Senior";
    } else if (age > 60) {
        this.membershipType = "overSixtyFee";
    }
}
    
    
   
    } 
