//Author Jasmin
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Competitor extends Member {
    private Duration result;
    private Duration trainingResult;
    private LocalDateTime trainingDate;
    private LocalDateTime date;
    private List<String> disciplines;
    private int rank;
    private String coach;

    // Constructor for Competitor
    public Competitor(String name, String phoneNumber, LocalDate birthDate, SwimType swimType, boolean activeMembership, String coach, List<String> disciplines) {
        super(name, phoneNumber, birthDate, swimType, activeMembership);
        this.coach = coach;
        this.disciplines = disciplines;
    }

    //getters
    public Duration getResult() {
        return result;
    }

    public Duration getTrainingResult() {
        return trainingResult;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public ArrayList<String> getDisciplines() {
        return new ArrayList<>(disciplines);
    }

    public LocalDateTime getTrainingDate() {
        return trainingDate;
    }
    public String getCoach(){
      return coach;
   }
   public int getRank(){
      return rank;
   }

    //setters
    public void setResult(Duration result) {
        this.result = result;
    }

    public void setTrainingResult(Duration trainingResult) {
        this.trainingResult = trainingResult;
    }

    public void setTrainingDate(LocalDateTime trainingDate) {
        this.trainingDate = trainingDate;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void addDiscipline(String discipline) {
        disciplines.add(discipline);
    }
    public void setCoach(String coach){
      this.coach = coach;
   }
   public void setRank(int rank){
      this.rank = rank;
   }
}


//for controller class

      //DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("mm:ss.SSS");

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
               LocalTime result;
               
               try{
                  result = LocalTime.parse(resultTime, timeFormatter);
               } catch (DateTimeParseException e) {
                  System.out.println("Invalid time format");
               }
               
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