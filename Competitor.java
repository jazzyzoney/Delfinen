//Author Jasmin
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
   
public class Competitor extends Member {
   //private ArrayList<String> disciplines = new ArrayList<>();
   private String coach;
   int rank;
   LocalDateTime date;
   LocalTime result;
   
   LocalDateTime trainingDate;
   LocalTime trainingResult;
   
   private List<String> disciplines;
   
   public Competitor(String name, String phoneNumber, LocalDate birthDate, SwimType swimType, boolean activeMembership, String coach, List<String> disciplines) {
      super(name, phoneNumber, birthDate, swimType, activeMembership); 
      this.coach = coach;
      this.rank = rank;
      this.disciplines = disciplines != null ? disciplines : new ArrayList<>();
   }
   
   //getter
   public String getName(){
      return super.getName();
   }
   public String getMemberId(){
      return super.getMemberId();
   }
   public List<String> getDisciplines() {
        return disciplines;
    }
   public String getCoach(){
      return coach;
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
   
   public LocalDateTime getTrainingDate(){
      return trainingDate;
   }
   public LocalTime getTrainingResult(){
      return trainingResult;
   }
   
   //setters
   public void setDisciplines(String discipline){
      this.disciplines.add(discipline);
   }
   public void setCoach(String coach){
      this.coach = coach;
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
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss.SSS");  
      this.result = LocalTime.parse(result, formatter);
   }
   
   public void setTrainingDate(String trainingDate){
      // Define a format for the date string (e.g., YYYY-MM-DD)
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
      this.trainingDate = LocalDateTime.parse(trainingDate, formatter);
   }
   public void setTrainingResult(String trainingResult){
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss.SSS");  
      this.trainingResult = LocalTime.parse(trainingResult, formatter);
   }
}

//for controller class
            // Coach
            /*case 5:
               System.out.println("Enter member ID:");
               String memberId = scanner.nextLine();

               System.out.println("Enter discipline (Back Crawl, Crawl, Breast, Butterfly):");
               String discipline = scanner.nextLine();

               System.out.println("Enter result type (1: Training, 2: Competition):");
               int resultType = scanner.nextInt();
               scanner.nextLine();  // consume newline

               System.out.println("Enter result time (mm:ss.SSS):");
               String resultTime = scanner.nextLine();
               LocalTime result = LocalTime.parse(resultTime);
            
               // Find the competitor
               Competitor competitor = null;
               for (Member member : membersDatabase.getMembers()) {
                  if (member.getMemberId().equals(memberId) && member instanceof Competitor) {
                     competitor = (Competitor) member;
                     break;
                  }
               }
            
               if (competitor != null) {
                  competitionHandler.RecordResult(resultType, competitor, result, discipline);
                  System.out.println("Result recorded successfully!");
               } else {
                  System.out.println("Competitor not found!");
               }
               break;
               
            case 6:
               System.out.println("Enter discipline number (1: Back Crawl, 2: Crawl, 3: Breast, 4: Butterfly):");
               int disciplineNumber = scanner.nextInt();
               competitionHandler.getResults(disciplineNumber);
               break;  
                
            case 7:
               System.out.println("Enter discipline number (1: Back Crawl, 2: Crawl, 3: Breast, 4: Butterfly):");
               int disciplineNumberForTopFive = scanner.nextInt();
               competitionHandler.TopFive(disciplineNumber);
               break; */