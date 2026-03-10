package A10_Object_Oriented_Thinking.Exercises;

import java.util.Date;
import java.util.Scanner;

public class Exercise10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true){
            System.out.print("Enter an ID(0-9): ");
            int id = input.nextInt();

            while (id < 0 || id > 9) {
                System.out.println("Wrong ID");
                System.out.print("Enter an ID(0-9): ");
                id = input.nextInt();
            }

            int choice;

            do {
                System.out.println("\nMain Menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();


                switch (choice){
                    case 1: System.out.println("The balance is " + accounts[id].getBalance()); break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        accounts[id].withdraw(input.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to depost: ");
                        accounts[id].deposit(input.nextDouble());
                        break;
                    default: break;
                }
            }while (choice > 0 && choice < 4);
        }

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

