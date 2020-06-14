package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Khabib";
        String lastName = "Legend";
        int age = 17;
        String citizen1 = "Russia";
        String citizen2 = "USA";

        boolean eligibleAge = age >= 18;
                              //21 >= 18 ==> true

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                        //   "USA" =="USA"  ||   "france" == "USA"
                    //            true      ||     false
                    //  true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                         true    &&  true  ==> true

        String fullName = firstName+" "+lastName;
        System.out.println(fullName + " is eligible to vote for Trump: "+eligibleToVote  );
        // Conor Mcgragor is eligible to vote for Trump: false



    }

}
