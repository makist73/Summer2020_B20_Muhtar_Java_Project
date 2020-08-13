package day40_CustomClassPractice;
/*
Offer
		Attribute:
			salary, Location, hasPTO, isFullTime, WFH, jobTitle, hasBenefit

		Actions:
			setOfferInfo
			getOfferInfo

		MUST use this keyword
 */

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;


    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean isWFH, String jobTitle, boolean hasBenefit){
        salary  = salary;
        state = state;
        hasPTO = hasPTO;
        isFullTime = isFullTime;
        isWFH = isWFH;
        jobTitle = jobTitle;
        hasBenefit = hasBenefit;
    }


    public void getOfferInfo(){// display the offer info
        System.out.println("==============================================");
        System.out.println("Salary: "+salary);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Location: "+state);
        System.out.println("==============================================");
    }



}
