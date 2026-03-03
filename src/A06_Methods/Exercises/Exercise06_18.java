package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    public static boolean isValidPassword(String password){
        return (hasCorrectLength(password) && isOnlyLettersAndDigits(password) && hasAtLeastTwoDigits(password));

    }

    public static boolean hasCorrectLength(String password){
        return password.length() >= 8;
    }

    public static boolean isOnlyLettersAndDigits(String password){
        for (int i = 0; i < password.length(); i++){
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean hasAtLeastTwoDigits(String password){
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                digitCount++;

                if (digitCount >= 2)
                    return true;
            }
        }
        return false;
    }
}
