package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_08 {
    public static void main(String[] args) {
        Accountt account = new Accountt("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account.toString() + "\n");
        for (Transaction t: account.getTransactions()){
            System.out.println("Date: " + t.getDate());
            System.out.println("Type: " + t.getType());
            System.out.println("Amount: " + t.getAmount());
            System.out.println("Balance: " + t.getBalance());
            System.out.println("Description: " + t.getDescription());
            System.out.println();
        }
    }
}

class Accountt{
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private ArrayList<Transaction> transactions;
    private Date dateCreated;

    //Constructors
    public Accountt(){
        this("Undefined", 0, 0.0);
    }

    public Accountt(int id, double balance){
        name = "Undefined";
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Accountt(String name, int id, double balance){
        this(id, balance);
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
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

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    //Setters
    public void setName(String name) {
        this.name = name;
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



    public double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 100 / 12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * getBalance();
    }

    public void withdraw(double amount){
        balance-=amount;
        transactions.add(new Transaction(Transaction.WITHDRAW, amount, balance, "Amount Withdrew"));
    }

    public void deposit(double amount){
        balance+=amount;
        transactions.add(new Transaction(Transaction.DEPOSIT, amount, balance, "Amount Deposited"));
    }

    public String toString() {
        return "\nAccount ID: " + id
                +"\nName: " + name
                +"\nDate created: " + getDateCreated()
                + "\nBalance: " + balance +
                "\nMonthly interest: " + getMonthlyInterest();
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    public static final char WITHDRAW = 'W';
    public static final char DEPOSIT = 'D';

    //Constructor
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }


    //Getters
    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }


    //Setters
    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

