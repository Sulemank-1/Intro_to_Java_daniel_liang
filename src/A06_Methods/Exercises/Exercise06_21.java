package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String phoneNumber = input.nextLine();


        String result = "";

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);

            if (Character.isLetter(ch)) {
                result += getNumber(Character.toUpperCase(ch));
            } else {
                result += ch;
            }
        }

        System.out.println(result);

        input.close();
    }

    public static int getNumber(char upperCaseLetter){
        int value = 0;
        if (upperCaseLetter >= 'A' && upperCaseLetter <= 'Z'){
            switch (upperCaseLetter){
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
            return value;
        } else
            return -1;
    }
}
