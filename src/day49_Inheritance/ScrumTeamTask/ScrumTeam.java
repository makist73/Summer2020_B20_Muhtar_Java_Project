package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam
                    Attributes:
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> developers = new ArrayList<>(),
                    Actions:
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long ID): removes the given tester from the testers arraylist
                            removeDeveloper(long ID): removes the developer from the developers arraylist
 */
public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers) );
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll( Arrays.asList(developers) );
    }

    public void removeTester(int ID){
        testers.removeIf( p -> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf( p -> p.ID == ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);  // removes the tester from list
        removeDeveloper(developerID);  // removes the developer form the list
    }



}
