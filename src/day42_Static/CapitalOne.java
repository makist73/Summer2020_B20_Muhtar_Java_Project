package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {

        Tester[] testers = { new Tester(), new Tester(), new Tester() };
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),};
        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 4500000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 550000);
        developers[2].setInfo("burak", 'M', 43333L, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76543, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 0005L, "Dev", 120000);


        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);


    }
}
