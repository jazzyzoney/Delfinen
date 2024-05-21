//Author Caroline B.

import java.util.ArrayList;

public class MembersDatabase {

    private ArrayList<Member> members;

    public MembersDatabase() {
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void printAllMembers() {
        System.out.println();
        System.out.println("All Members:");

        for (Member member : members) {
            System.out.println();
            System.out.println("Member:");
            member.print();
        }
    
}
}







   
 
