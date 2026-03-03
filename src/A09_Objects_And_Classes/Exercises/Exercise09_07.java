package A09_Objects_And_Classes.Exercises;

import java.util.Date;

public class Exercise09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterest());
        System.out.println("Date: " + account.getDateCreated());

    }
}

class Account{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int newId){
        id = newId;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 100 / 12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * getBalance();
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }


}
