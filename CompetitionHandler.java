//jasmin
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CompetitionHandler{
   
   String competitionName;
   //getter
   public String getCompetitionName(){
      return competitionName;
   }
   //setter
   public void setCompetitionName(String competitionName){
      this.competitionName = competitionName;
   }
    
//arraylister junior - 4 discipliner
   public ArrayList<Competitor> juniorSwimmer = new ArrayList<>();
   public ArrayList<Competitor> juniorBackCrawl = new ArrayList<>();
   public ArrayList<Competitor> juniorCrawl = new ArrayList<>();
   public ArrayList<Competitor> juniorBreast = new ArrayList<>();
   public ArrayList<Competitor> juniorButterfly = new ArrayList<>();
//arraylister senior - 4 discipliner
   public ArrayList<Competitor> seniorSwimmer = new ArrayList<>();
   public ArrayList<Competitor> seniorBackCrawl = new ArrayList<>();
   public ArrayList<Competitor> seniorCrawl = new ArrayList<>();
   public ArrayList<Competitor> seniorBreast = new ArrayList<>();
   public ArrayList<Competitor> seniorButterfly = new ArrayList<>();
   
   public void addMemberToDiscipline(Competitor competitor){
      //adding junior swimmers to disciplines
      if (competitor.getAge() < 18){
         for(String discipline : competitor.getDisciplines()){
            switch (discipline){
               case "Back Crawl":
                  juniorBackCrawl.add(competitor);
                  break;
               case "Crawl":
                  juniorCrawl.add(competitor);
                  break;
               case "Breast":
                  juniorBreast.add(competitor);
                  break;
               case "Butterfly":
                  juniorButterfly.add(competitor);
                  break;
               default:
                  System.out.println("invalid");
            }
         }
      } else {
         //adding senior swimmers to disciplines
         for(String discipline : competitor.getDisciplines()){
            switch (discipline){
               case "Back Crawl":
                  seniorBackCrawl.add(competitor);
                  break;
               case "Crawl":
                  seniorCrawl.add(competitor);
                  break;
               case "Breast":
                  seniorBreast.add(competitor);
                  break;
               case "Butterfly":
                  seniorButterfly.add(competitor);
                  break;
               default:
                  System.out.println("invalid");
            }
         }
      }
   }

//writing results to: a list with competition results, a list with training results
   public void RecordResult(int resultType, Competitor competitor, LocalTime result){ 
      //switch case 1. training results, 2. competition results
      switch (resultType){
         case 1:
            competitor.setTrainingResult(result.toString());
            competitor.setTrainingDate(LocalDateTime.now().toString());
            System.out.println("Training result registered for: " + competitor.getMemberId());
            break;
         case 2:
            competitor.setResult(result.toString());
            //set date, rank...?
            addMemberToDiscipline(competitor); //will def give problems since it only adds the result to the swimmer and not to specific disciplines
            System.out.println("Competition result registered for: " + competitor.getMemberId());
            break;
         default:
            System.out.println("invalid");
      }
   }
   
   //showing a list with competition results and a list with training results
   public void GetResults(){
   
      //loop over hver arrayliste og printe
      for (String discipline : new String[]{"Back Crawl", "Crawl", "Breast", "Butterfly"}) {
         
         //SENIOR RESULTS
         //print "senior:"
         System.out.println();
         //seniorBackCrawl
         for (Competitor competitor : seniorBackCrawl){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //seniorCrawl
         for (Competitor competitor : seniorCrawl){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //seniorBreast
         for (Competitor competitor : seniorBreast){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //seniorButterfly
         for (Competitor competitor : seniorButterfly){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
      
      //JUNIOR RESULTS
      //print "junior: "
         //juniorBackCrawl
         for (Competitor competitor : juniorBackCrawl){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //juniorCrawl
         for (Competitor competitor : juniorCrawl){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //juniorBreast
         for (Competitor competitor : juniorBreast){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
         //juniorButterfly
         for (Competitor competitor : juniorButterfly){
            LocalTime result = LocalTime.parse(competitor.getResult());
            if(result != null) {
               System.out.println(competitor.getName()); //name
               System.out.println("Competition result: " + result);
               System.out.println("Date: " + competitor.getDate()); //date
            }
            LocalTime trainingResult = competitor.getTrainingResult();
            if (trainingResult != null) {
               System.out.println("Training result: " + trainingResult);
               System.out.println("Date: " + competitor.getTrainingDate()); //date
            }
         }
      }
   }

//top 5 swimmers in each swim discipline and age group
   public void TopFive(){
      //loop over hver arrayliste, sortere efter tid og printe
      
   } 
}
/*
tested code in main:
      CompetitionHandler ch = new CompetitionHandler();
      Competitor junior = new Competitor();
      junior.setName("ses");
      ch.juniorSwimmer.add(junior);
      System.out.println(ch.juniorSwimmer.get(0).name); 
*/