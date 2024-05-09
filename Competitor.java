//jasmin
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
   public void setCompetitionName(String competitionName){
      this.competitionName = competitionName;
   }
   public void setRank(int rank){
      this.rank = rank;
   }
   public void setDate(String date){
      // Define a format for the date string (e.g., YYYY-MM-DD)
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
      this.date = LocalDateTime.parse(date, formatter);
   }
   public void setResult(String result){
      // Define a format for the time string (e.g., HH:mm:ss)
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");  
      this.result = LocalTime.parse(result, formatter);
   }
}