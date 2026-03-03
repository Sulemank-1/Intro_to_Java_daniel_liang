package A08_Multidimensional_Arrays;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int row = 0; row < points.length; row++){
            for (int col = 0; col < points[row].length; col++)
                points[row][col] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for(int row = 0; row < points.length; row++){
            for (int col = row + 1; col < points.length; col++){
                double distance = distance(points[row][0], points[row][1], points[col][0], points[col][1]);

                if (shortestDistance > distance){
                    p1 = row;
                    p2 = col;
                    shortestDistance = distance;
                }
            }
        }

        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }


}
