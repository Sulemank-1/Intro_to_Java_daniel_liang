package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args) {

    }

    public static void checkSSN(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        boolean correctDigits =
                Character.isDigit(ssn.charAt(0)) &&
                        Character.isDigit(ssn.charAt(1)) &&
                        Character.isDigit(ssn.charAt(2)) &&

                        Character.isDigit(ssn.charAt(4)) &&
                        Character.isDigit(ssn.charAt(5)) &&

                        Character.isDigit(ssn.charAt(7)) &&
                        Character.isDigit(ssn.charAt(8)) &&
                        Character.isDigit(ssn.charAt(9)) &&
                        Character.isDigit(ssn.charAt(10));

        boolean correctHyphens = (ssn.charAt(3) == '-' && ssn.charAt(6) == '-');
        boolean correctLength = (ssn.length() == 11);


        if (correctHyphens && correctLength && correctDigits)
            System.out.printf("%s is a valid social security number", ssn);
        else
            System.out.printf("%s is a invalid social security number", ssn);
    }

}
