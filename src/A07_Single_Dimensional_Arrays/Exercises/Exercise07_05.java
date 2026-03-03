package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int[] numbers = new int[n];
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < n; i++){
            int num = input.nextInt();
            boolean present = false;

            for (int j = 0; j < count; j++){
                if (numbers[j] == num){
                    present = true;
                    break;
                }
            }

            if (!present) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        for (int i = 0; i<count; i++)
                System.out.print(numbers[i] + " ");
    }
}
