package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int[] reversedNumbers = reverse(numbers);

        for (int i: reversedNumbers)
            System.out.print( i + " ");

    }

    public static int[] reverse(int[] array){
        for (int i = 0, j=array.length-1; i<array.length/2; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }
}
