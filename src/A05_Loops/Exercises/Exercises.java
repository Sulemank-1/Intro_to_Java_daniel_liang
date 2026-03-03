package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

    }

    public static void perfectNumber33(){
        /*(Perfect number) A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers < 10,000 Write a program to find all these four numbers.*/

        int sum = 0;

        for (int num = 1; num <10000; num++){

            for (int i = num /2; i >= 1; i--){
                if (num % i == 0){
                    sum+=i;
                }
            }

            if (sum == num)
                System.out.println(sum);
            sum = 0;
        }

    }

    public static void summation35(){
        double sum = 0.0;

        for (int num = 1; num < 1000; num++){
            sum = sum + (1 / (Math.sqrt(num) + Math.sqrt(num+1))) ;
        }

        System.out.println(sum);
    }

    public static void decimalToBinary37(){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int num = input.nextInt();

        String r = "";
        String binary = "";

        while(num > 0){
            r += num % 2;
            num /= 2;
        }

        for (int i = r.length() - 1; i>=0; i--){
            binary += r.charAt(i);
        }

        System.out.println(binary);
    }

    public static void decimalToOctal38(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int num = input.nextInt();

        String r = "";
        String octal = "";

        while(num > 0){
            r += num % 8;
            num /= 8;
        }

        for (int i = r.length() - 1; i>=0; i--){
            octal += r.charAt(i);
        }

        System.out.println(octal);
    }

    public static void findSalesAmount39(){
        /*(Financial application: find the sales amount) You have just started a sales job in a department store.
        Your pay consists of a base salary and a commission. The base salary is $5,000. The scheme shown below is
        used to determine the commission rate.
        Sales Amount        Commission Rate

        $0.01–$5,000            8%

        $5,000.01–$10,000       10%

        $10,000.01 and above    12%

        Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5000 * 8 + 5000 * 10 + 15000 * 12 = 2700 Your goal is to earn $30,000 a year. Write a program that finds
        out the minimum number of sales you have to generate in order to make $30,000. */


    }

    public static void reverseString46(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();
        String reversedStr = "";

        for (int i = str.length() - 1; i>=0; i--){
            reversedStr += str.charAt(i);
        }

        System.out.println(reversedStr);
    }

    public static void evenPositionChars48(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String evenStr = "";

        for (int i = 0; i < str.length(); i+=2){
            evenStr += str.charAt(i);

        }

        System.out.println(evenStr.replace(" ", ""));
    }

    public static void countVowelsConsonants49(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.replaceAll(" ", "");
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++){
            switch (Character.toUpperCase(str.charAt(i))){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': vowels++; break;
                default: consonants++; break;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }



}