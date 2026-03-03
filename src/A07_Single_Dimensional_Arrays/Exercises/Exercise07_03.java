package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[101];

        System.out.print("Enter integers between 1 and 100 (0 to end): ");
        int num = input.nextInt();

        while (num != 0) {
            if (num >= 1 && num <= 100) {
                counts[num]++;
            }
            num = input.nextInt();
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d occurs %d %s\n", i, counts[i], counts[i] > 1 ? "times" : "time");
            }
        }
    }
}
