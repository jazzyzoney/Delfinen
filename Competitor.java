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
}
