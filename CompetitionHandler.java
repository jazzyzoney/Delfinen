//Author Jasmin
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CompetitionHandler {

   String competitionName;
   //getter
   public String getCompetitionName() {
      return competitionName;
   }
   //setter
   public void setCompetitionName(String competitionName) {
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

   public void addMemberToDiscipline(Competitor competitor) {
      //adding junior swimmers to disciplines
      if (competitor.getAge() < 18) {
         for (String discipline : competitor.getDisciplines()) {
            switch (discipline) {
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
         for (String discipline : competitor.getDisciplines()) {
            switch (discipline) {
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
   public void RecordResult(int resultType, Competitor competitor, LocalTime result, String discipline) {
      //switch case 1. training results, 2. competition results
      switch (resultType) {
         case 1:
            competitor.setTrainingResult(result.toString());
            competitor.setTrainingDate(LocalDateTime.now().toString());
            System.out.println("Training result registered for: " + competitor.getMemberId());
            break;
         case 2:
            competitor.setResult(result.toString());
            //set date, rank...?
            addResultToDiscipline(competitor, result, discipline);
            System.out.println("Competition result registered for: " + competitor.getMemberId());
            break;
         default:
            System.out.println("invalid");
      }
   }

   private void addResultToDiscipline(Competitor competitor, LocalTime result, String discipline) {
      if (competitor.getAge() < 18) {
         switch (discipline) {
            case "Back Crawl":
               addResultToCompetitorList(juniorBackCrawl, competitor, result);
               break;
            case "Crawl":
               addResultToCompetitorList(juniorCrawl, competitor, result);
               break;
            case "Breast":
               addResultToCompetitorList(juniorBreast, competitor, result);
               break;
            case "Butterfly":
               addResultToCompetitorList(juniorButterfly, competitor, result);
               break;
         }
      } else {
         switch (discipline) {
            case "Back Crawl":
               addResultToCompetitorList(seniorBackCrawl, competitor, result);
               break;
            case "Crawl":
               addResultToCompetitorList(seniorCrawl, competitor, result);
               break;
            case "Breast":
               addResultToCompetitorList(seniorBreast, competitor, result);
               break;
            case "Butterfly":
               addResultToCompetitorList(seniorButterfly, competitor, result);
               break;
         }
      }
   }

   private void addResultToCompetitorList(ArrayList<Competitor> competitorList, Competitor competitor, LocalTime result) {
      for (Competitor c : competitorList) {
         if (c.getMemberId().equals(competitor.getMemberId())) {
            c.setResult(result.toString());
            return;
         }
      }
      competitorList.add(competitor);
   }

   public void printResult(Competitor competitor) {
      LocalTime result = LocalTime.parse(competitor.getResult().toString());
      if (result != null) {
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
   public void getResults(int discipline) {
   
      int seniorDiscipline = discipline;
      int juniorDiscipline = discipline;
   
      //loop over every arraylist and print
      switch (seniorDiscipline) {
         //SENIOR RESULTS
         //seniorBackCrawl
         case 1:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorBackCrawl) {
               printResult(competitor);
            }
            break;
         //seniorCrawl
         case 2:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorCrawl) {
               printResult(competitor);
            }
            break;
         //seniorBreast
         case 3:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorBreast) {
               printResult(competitor);
            }
            break;
         //seniorButterfly
         case 4:
            System.out.println("Senior " + discipline + " results: ");
            for (Competitor competitor : seniorButterfly) {
               printResult(competitor);
            }
            break;
      }
   
      //JUNIOR RESULTS
      switch (juniorDiscipline) {
         //juniorBackCrawl
         case 1:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorBackCrawl) {
               printResult(competitor);
            }
            break;
         //juniorCrawl
         case 2:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorCrawl) {
               printResult(competitor);
            }
            break;
         //juniorBreast
         case 3:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorBreast) {
               printResult(competitor);
            }
            break;
         //juniorButterfly
         case 4:
            System.out.println("Junior " + discipline + " results: ");
            for (Competitor competitor : juniorButterfly) {
               printResult(competitor);
            }
            break;
      }
   } // END OF GETRESULTS METHOD

   //top 5 swimmers in each swim discipline and age group
   public void TopFive(int discipline) {
      //loop over every arraylist, sort by tid and print
   
      ArrayList<Competitor> seniorTopList = new ArrayList<>();
      ArrayList<Competitor> juniorTopList = new ArrayList<>();
   
      //loop through senior and junior lists for the current discipline
      switch (discipline) {
         case 1:
            seniorTopList.addAll(seniorBackCrawl);
            juniorTopList.addAll(juniorBackCrawl);
            break;
         case 2:
            seniorTopList.addAll(seniorCrawl);
            juniorTopList.addAll(juniorCrawl);
            break;
         case 3:
            seniorTopList.addAll(seniorBreast);
            juniorTopList.addAll(juniorBreast);
            break;
         case 4:
            seniorTopList.addAll(seniorButterfly);
            juniorTopList.addAll(juniorButterfly);
            break;
      }
   
      //sort both lists based on training results (lowest time is best)
      Collections.sort(seniorTopList, (c1, c2) -> c1.getTrainingResult().compareTo(c2.getTrainingResult()));
      Collections.sort(juniorTopList, (c1, c2) -> c1.getTrainingResult().compareTo(c2.getTrainingResult()));
   
      //print top 5 for Seniors
      System.out.println("Senior " + getDisciplineName(discipline) + " results:");
      for (int i = 0; i < Math.min(5, seniorTopList.size()); i++) {
         printResult(seniorTopList.get(i));
      }
   
      //print top 5 for Juniors
      System.out.println("Junior " + getDisciplineName(discipline) + " results:");
      for (int i = 0; i < Math.min(5, juniorTopList.size()); i++) {
         printResult(juniorTopList.get(i));
      }
   }

   //helper method to convert discipline number to discipline name
   private String getDisciplineName(int discipline) {
      switch (discipline) {
         case 1:
            return "Back Crawl";
         case 2:
            return "Crawl";
         case 3:
            return "Breast";
         case 4:
            return "Butterfly";
         default:
            return "Unknown";
      }
   }
}