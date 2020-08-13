package day40_CustomClassPractice;
/*
BankAccount
        attributes/data that can have are:
            1. AccountHolder, 2. AccountNumber, 3. Balance, 4. AccountType
      	Actions:
      		1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
            3. user should be able to see their balance

 */

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String accountType, String accountHolder, String accountNumber){ // sets the info

         this.accountType = accountType;
         this.accountHolder = accountHolder;
         this.accountNumber = accountNumber;

    }

    public void getAccountInfo(){ // displays account info
        System.out.println("============================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("============================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance += amount;
    }

    public void withDraw(double amount){
        if(amount > balance){
            System.out.println("not enough balance");
            return; //
        }

            System.out.println("Withdrawing $" + amount + " from " + accountNumber);
            balance -= amount;

    }





}
