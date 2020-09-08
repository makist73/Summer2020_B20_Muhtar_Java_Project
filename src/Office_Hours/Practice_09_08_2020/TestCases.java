package Office_Hours.Practice_09_08_2020;

public class TestCases {

    public static void main(String[] args) {

        Credentials c1 = new Credentials();

      //  System.out.println(c1.userName); // No direct access to the private
      //  System.out.println(c1.passWord); // No direct access to the private

        System.out.println("User Name Entered: "+c1.getUserName());

       // c1.userName = "Batch20";

        c1.setUserName("Batch20");

        System.out.println("New User Name Entered: "+c1.getUserName());
        System.out.println("User Name Entered Again: "+c1.getUserName());

        System.out.println("============================================");

        System.out.println("Pass Word Entered: "+c1.getPassWord());

       // c1.passWord = "JavaTurtles";

        c1.setPassWord("JavaTurtles");

        System.out.println("New Pass Word Entered: "+ c1.getPassWord());
        System.out.println("New Pass Word Entered Again: "+c1.getPassWord());




    }


    /*
    public String getUserName(){
        return userName;
    }
*/

}
