package day41_toString_Practice;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: "+salary;
    }

}


class DeveloperObject{

    public static void main(String[] args) {

        Developer[] developers ={new Developer(), new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};

        developers[0].setInfo("Ahmet", 125000, "Male", 30);
        developers[1].setInfo("Erfan", 150000,"Male",29);
        developers[2].setInfo("Arpat", 150000,"Male",27);
        developers[3].setInfo("Ajit",120000,"M",30);
        developers[4].setInfo("Massimo", 180000,"Male",36);
        developers[5].setInfo("Cristina",155000,"Female",26);

        for( Developer each : developers){
            each.coding();
        }

        System.out.println("===================================");
        for(int i=0; i <= developers.length-1; i++){
            developers[i].fixBugs();
        }


    }

}

