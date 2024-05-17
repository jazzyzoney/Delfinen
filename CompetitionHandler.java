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
   
   public void printResult(Competitor competitor) { //helper method to prevent repetitive code
      LocalTime result = LocalTime.parse(competitor.getResult().toString());
      if(result != null) {
         System.out.println(competitor.getName()); //competitor name
         System.out.println("Competition result: " + result);
         System.out.println("Date: " + competitor.getDate()); //competition date
      }
      
      LocalTime trainingResult = competitor.getTrainingResult();
      if (trainingResult != null) {
         System.out.println("Training result: " + trainingResult);
         System.out.println("Date: " + competitor.getTrainingDate()); //training date
      }
   }
   
   //showing a list with competition results and a list with training results
   public void getResults(int discipline){
      
      int seniorDiscipline = discipline;
      int juniorDiscipline = discipline;
      
      //loop over hver arrayliste og printe 
      switch (seniorDiscipline){
         //SENIOR RESULTS
         //seniorBackCrawl
         case 1:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorBackCrawl){
               printResult(competitor);
            }
            break;
         //seniorCrawl
         case 2:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorCrawl){
               printResult(competitor);
            }
            break;
         //seniorBreast
         case 3:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorBreast){
               printResult(competitor);
            }
            break;
         //seniorButterfly
         case 4:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorButterfly){
               printResult(competitor);
            }
            break;
      }
         
         //JUNIOR RESULTS
      switch (juniorDiscipline){
            //juniorBackCrawl
         case 1:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorBackCrawl){
               printResult(competitor);
            }
            break;
            //juniorCrawl
         case 2:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorCrawl){
               printResult(competitor);
            }
            break;
            //juniorBreast
         case 3:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorBreast){
               printResult(competitor);
            }
            break;
            //juniorButterfly
         case 4:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorButterfly){
               printResult(competitor);
            }
            break;
      }
   } // END OF GETRESULTS METHOD

//top 5 swimmers in each swim discipline and age group
   public void TopFive(){
      //loop over hver arrayliste, sortere efter tid og printe
      // ArrayList<Competitor> result = new ArrayList<>() læs op på linked lists og brug det i stedet for arraylist for at kunne rykke nemmere rundt på elementerne
      // for (Competitor competitor : seniorCrawl) {
      //   competitor.getTrainingResult()
      //   for (Competitor otherCompetitor : result) {
      //     if(competitor.getTrainingResult().isBefore(otherCompetitor.getTrainingResult()) {
      //       competitor --> overtake otherCompetitors place in result arraylist
      //     } 
      //   }
      // }
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