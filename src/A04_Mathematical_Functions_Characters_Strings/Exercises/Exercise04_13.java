package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {

    }

    public static void vowelOrConsonant(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ltr = letter.charAt(0);
        char capLtr = Character.toUpperCase(ltr);

        if (capLtr >= 'A' && capLtr <= 'Z') {
            switch (capLtr) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.printf("%c is a vowel", ltr);
                    break;
                default:
                    System.out.printf("%c is a consonant", ltr);
                    break;
            }
        }else
            System.out.printf("%c is an invalid input", ltr);


    }

}
