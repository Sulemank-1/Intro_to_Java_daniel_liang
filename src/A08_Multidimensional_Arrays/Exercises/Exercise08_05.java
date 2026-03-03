package A08_Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {

        System.out.print("Enter matrix 1: ");
        double[][] a = getArray();

        System.out.print("Enter matrix 2: ");
        double[][] b = getArray();

        double[][] c = addMatrix(a, b);

        System.out.println("The matrix are added as follows");
        displayArray(c);


    }

    public static double[][] getArray(){
        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();
        }

        return a;
    }

    public static void displayArray(double[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        }

        return c;
    }
}
