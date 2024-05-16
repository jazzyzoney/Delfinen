//Author Caroline B.
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;


public class Person {

String name;
String phoneNumber;
public int age;
public LocalDate birthDate;


//getters

public String getName(){
  return name;
  }

public String getPhoneNumber(){
    return phoneNumber;
    
} 
 public int getAge(){
   return age;
   }
   public LocalDate getBirthDate(){
      return birthDate;
   }
//setter   

public void setName(String name){
     this.name = name;
}

public void setPhoneNumber(String phoneNumber){
     this.phoneNumber = phoneNumber;
}
public void setBirthDate(String birthDate){
      this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      this.age = ageCalculator();
   }


//This calculates the age of the member. Kaldes med den member-arrayliste - kalder agacalcalculater med en  arrayliste. This. birthday kalder variable "birthDate" på hevrt medlem.
   //metode til duregning af alder vi oprettelse og ved opstart af fil.
   public int ageCalculator() {
      LocalDate today = LocalDate.now();
      age = Period.between(birthDate, today).getYears();
      return age;
        
          // LocalDate skal løses mht. datatype og hvilken variable der skal bruges i denne metode
   }


}