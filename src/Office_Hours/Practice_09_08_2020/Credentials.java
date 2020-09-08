package Office_Hours.Practice_09_08_2020;

public class Credentials {

    private String userName = "Cybertek";
    private String passWord = "CyberTek1234";

    public String getUserName(){  // Read ONLY
        return userName;
    }

    public void setUserName(String userName){ // Modify
        this.userName = userName;
    }


    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
