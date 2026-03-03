package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the integers: ");
        for (int i=0; i<n; i++){
            numbers[i] = input.nextInt();
        }

        reverse(numbers);

        for (int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void reverse(int[] list){
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

}
