//jasmin
import java.util.ArrayList;
import java.util.Collections;

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

//a list with competition results, a list with training results
   public void RecordResult(){
      //switch case 1. træning 2. konkurrence
   }
   
   public void GetResults(){
      
   }

//top 5 swimmers in each swim discipline and age group
   public void TopFive(){
      
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