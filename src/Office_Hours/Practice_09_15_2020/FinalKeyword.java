package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {

    private final int c = 200;  // cannot be modified

    public int getC(){ // ready ONLY
        return c;
    }

    public void setC(int c){ // modify ONLY
   //     this.c = c;
    }

    /*
    5 private variables:
            3 of them are final
            2 of them are not final

    how many getter:   5
    how many setter:   2

     */

 //   final static int z = 300;
    final private String userName = "cybertek";
    final private String passWord = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public static void main(String[] args) {
       final int a = 100;
       //a = 200;
    }


}
