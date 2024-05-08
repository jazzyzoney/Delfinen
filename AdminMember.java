//Author Caroline B.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class AdminMember extends Member{



 public AdminMember(String memberID, String name, LocalDate birthDate, int phoneNumber, boolean membershipType, boolean activityType) {
        this.memberId = memberId;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.membershipType = membershipType;
        this.activityType = activityType;



 //This methods is used to create a random Member Id to a  new member of the swim club 
    private String createId() {
        var full = UUID.randomUUID();
        var fullAsString = full.toString();
        return fullAsString.substring(0,8);//generates a unique 8-character ID using UUIDs.
    }

    //This calculates the age of the member
    public void ageCalculator() {
        LocalDate today = LocalDate.now();
        int ageInYears = Period.between(ageInYears, today).getYears();
    }
        public void format() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formatted = birthDate.format(format);
    }

        
//This sets the membership type after age
        public void membershipAgeType() {
        ageCalculator(); // to calculate the age first. 
    if (ageInYears < 18) {
        this.membershipAgeType = "Junior";
    } else if (ageInYears >= 18 && ageInYears <= 60) {
        this.membershipAgeType = "Senior";
    } else if (ageInYears > 60) {
        this.membershipAgeType = "overSixtyFee";
    }
}
    
    
   
    } 
