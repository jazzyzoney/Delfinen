//jasmin
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Competitor extends Member{
   
   String coach;
   String competitionName;
   int rank;
   LocalDateTime date;
   LocalTime result;
  
   //getter
   public String getCoach(){
      return coach;
   }
   public String getCompetitionName(){
      return competitionName;
   }
   public int getRank(){
      return rank;
   }
   public LocalDateTime getDate(){
      return date;
   }
   public LocalTime getResult(){
      return result;
   }
   
   //setters
   public void setCoach(String coach){
    this.coach = coach;
   }
   
   }