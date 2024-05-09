//jasmin
//crawl, butterfly, breast backCrawl
import java.util.ArrayList;
import java.util.Collections;

public class CompetitionHandler{

/*
getResult()
recordResult()
*/

//top 5 swimmers in each swim discipline and age grup 

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


}

/* tested code in main:
      CompetitionHandler ch = new CompetitionHandler();
      Competitor junior = new Competitor();
      junior.setName("ses");
      ch.juniorSwimmer.add(junior);
      System.out.println(ch.juniorSwimmer.get(0).name);
      
*/