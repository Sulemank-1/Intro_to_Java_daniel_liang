package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.Date;

public class Exercise11_03 {
    public static void main(String[] args) {
        Account account = new Account(1, 100);
        CheckingAccount checkingAccount = new CheckingAccount(2, 200, -50);
        SavingsAccount savingsAccount = new SavingsAccount(3, 300);

        checkingAccount.withdraw(245);
        savingsAccount.withdraw(500);

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());
    }
}

class Account{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this(0, 0.0);
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
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

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double interestRate){
        annualInterestRate = interestRate;
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

    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: " + balance +
                "\nMonthly interest: " + getMonthlyInterest();
    }
}

class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(){
        super();
        overdraftLimit = -25;
    }

    public CheckingAccount(int id, double balance, double overDraftLimit){
        super(id, balance);
        this.overdraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() - amount >=  overdraftLimit)
            super.withdraw(amount);
        else
            System.out.println("Amount exceeds overdraft limit");
    }

    @Override
    public String toString() {
        return super.toString() + "\nOverdraft limit: " + overdraftLimit;
    }

}

class SavingsAccount extends Account{

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int id, double balance){
        super(id,balance);
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() - amount >  0)
            super.withdraw(amount);
        else
            System.out.println("Not enough balance");
    }

}

