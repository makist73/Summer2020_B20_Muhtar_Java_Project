package day51_Exceptions.BrowsersTask;

public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();


    }

}
