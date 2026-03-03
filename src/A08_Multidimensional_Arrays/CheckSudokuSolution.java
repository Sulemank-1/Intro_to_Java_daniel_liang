package A08_Multidimensional_Arrays;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");

    }

    public static int[][] readASolution(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                grid[r][c] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid){
        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                if (grid[r][c] < 1 || grid[r][c] > 9 || !isValid(r, c, grid))
                    return false;
            }
        }
        return true;
    }

    public static boolean isValid(int r, int c, int[][] grid){
        for (int column = 0; column < 9; column++){
            if (column != c && grid[r][column] == grid[r][c])
                return false;
        }

        for (int row = 0; row < 9; row++){
            if (row != r && grid[row][c] == grid[r][c])
                return false;
        }

        for (int row = (r / 3) * 3; row < (r /3) * 3 + 3; row++){
            for (int col = (c / 3) * 3; col < (c / 3) * 3 + 3; col++)
                if (!(row == r && col == c) && grid[row][col] == grid[r][c])
                    return false;
        }

        return true;
    }
}
