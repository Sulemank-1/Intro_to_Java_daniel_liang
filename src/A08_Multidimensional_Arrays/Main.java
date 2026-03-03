package A08_Multidimensional_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topic_8_3();
    }

    public static void Topic_8_2_1(){
//      Declaring Variables of Two-Dimensional Arrays and Creating Two-Dimensional Arrays

        int[][] matrix = new int[5][5];

        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10, 11, 12}
        };

    }

    public static void Topic_8_2_2(){
        // Obtaining the Lengths of Two-Dimensional Arrays

        int[][] x = new int[3][4];

        int length = x.length; //3
        int row1Length = x[0].length; //4
        int row2Length = x[0].length; //4
        int row3Length = x[0].length; //4
    }

    public static void Topic_8_2_3(){
        // Ragged Arrays

        int[][] triangleArrays = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        int[][] tArray = new int[5][];
        tArray[0] = new int[5];
        tArray[1] = new int[4];
        tArray[2] = new int[3];
        tArray[3] = new int[2];
        tArray[4] = new int[1];


    }

    public static void Topic_8_3(){
        // Processing Two-Dimensional Arrays

        Scanner input = new Scanner(System.in);

        //Initializing Arrays with input values
        int[][] matrix = new int[2][2];

//        System.out.println("Enter " +
//                "" + matrix.length +  " rows and " + matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++){
//            for (int column = 0; column<matrix[row].length; column++){
//                matrix[row][column] = input.nextInt();
//            }
//        }

        //Initializing arrays with random values
        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++)
                matrix[row][col] = (int)(Math.random() * 100);
        }

        //Printing arrays
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


        //Summing all elements
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }

        //Summing elements by column
        for (int column = 0; column < matrix[0].length; column++) {
            int ttotal = 0;

            for (int row = 0; row < matrix.length; row++)
                ttotal += matrix[row][column];

            System.out.println("Sum for column " + column + " is " + ttotal);
        }

        //Which row has the largest sum?
        int maxRow = 0;
        int indexOfMaxRow =0;

        for (int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;

            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];

            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);


        // Random shuffling

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }

    }
}