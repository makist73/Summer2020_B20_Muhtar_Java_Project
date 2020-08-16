package Office_Hours.Practice_08_12_2020;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester()};
        testers[0].setTesterInfo("m", 123, "SDET", 120000);
        testers[1].setTesterInfo("n", 1234, "SDET", 125000);

        Developer[] developers = {new Developer()};
        developers[0].setTesterInfo("J", 4567, "Developer", 130000);


        ScrumTeam myTeam = new ScrumTeam();
        myTeam.addDevelopers(developers);
        myTeam.addTesters(testers);

        Tester tester1 = new Tester();
        tester1.setTesterInfo("p", 1223, "SDET", 122000);

        myTeam.addTester(tester1);


        System.out.println(myTeam.developers.size());
        System.out.println(myTeam.testers.size());




    }

}
