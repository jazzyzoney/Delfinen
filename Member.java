//Autor  Caroline B. 


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Member extends Person {

private int id;
private String gender;
private LocalDate birthDate;
private boolean active;
private boolean competitive;


public Member (int id, String gender, String birthDate, boolean active, boolean competitive){

this.id = id; // Initializing the variables.
this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
this.active = active;
this.competitive = competitive;

} 



}