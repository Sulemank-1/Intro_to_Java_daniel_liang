package A08_Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();

        for (int i = 0; i < m[0].length; i++)
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));

    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0.0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][columnIndex];

        return sum;
    }
}
