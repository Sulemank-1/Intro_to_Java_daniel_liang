package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        System.out.print("Enter two integers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("Sum " + (number1 + number2));
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.print("Wrong input. Enter again: ");
                input.nextLine();
            }
        }while (continueInput);

    }
}
