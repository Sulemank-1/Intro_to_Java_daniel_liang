package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 10;
        int[] numbers = new int[n];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int count = 1;

        for (int i = 0; i < n-1; i++) {
            for (int j=i+1; j<n; j++){
                if (i!=j){
                    if (count % 5 == 0)
                        System.out.printf("(%d,%d)\n", numbers[i], numbers[j]);
                    else
                        System.out.printf("(%d,%d) ", numbers[i], numbers[j]);
                    count++;
                }

            }
        }

    }


}
