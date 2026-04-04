package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.Scanner;

public class Exercise12_03 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);

        System.out.print("Enter index: ");
        try {
            int index = input.nextInt();
            System.out.println(array[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of Bounds");
        }

    }
}
