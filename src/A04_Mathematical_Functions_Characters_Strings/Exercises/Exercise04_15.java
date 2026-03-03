package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {

    }

    public static void phoneKeyPads(){
        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ltr = letter.charAt(0);
        char capLtr = Character.toUpperCase(ltr);

        if (capLtr >= 'A' && capLtr <= 'Z'){
            switch (capLtr){
                case 'A':
                case 'B':
                case 'C': value = 2; break;
                case 'D':
                case 'E':
                case 'F': value = 3; break;
                case 'G':
                case 'H':
                case 'I': value = 4; break;
                case 'J':
                case 'K':
                case 'L': value = 5; break;
                case 'M':
                case 'N':
                case 'O': value = 6; break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S': value = 7; break;
                case 'T':
                case 'U':
                case 'V': value = 8; break;
                default: value = 9; break;
            }

            System.out.printf("The corresponding number is %d", value);
        } else
            System.out.printf("%s is an invalid input", ltr);

    }

}
