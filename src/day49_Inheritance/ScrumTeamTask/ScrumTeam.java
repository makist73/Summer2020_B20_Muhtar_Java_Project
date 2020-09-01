package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;

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
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
 */
public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public void addTester(Tester tester){
        testers.add(tester);
    }


}
