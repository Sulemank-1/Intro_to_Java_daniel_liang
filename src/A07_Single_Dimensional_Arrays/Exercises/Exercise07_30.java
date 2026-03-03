package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] values = new int[n];

        System.out.print("Enter the values: ");
        for (int i=0; i<n; i++)
            values[i] = input.nextInt();

        if (isConsecutive(values))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutive(int[] values){
        if (values.length < 4) return false; // Safety check

        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
        }

        return false;
    }
}
