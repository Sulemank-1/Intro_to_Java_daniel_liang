package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.Scanner;

public class Exercise12_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.toString());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        }
        catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }

    }
}

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message){
        super(message);
    }
}

class Triangle{
    double side1;
    double side2;
    double side3;

    public Triangle() throws IllegalTriangleException{
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalTriangleException("Invalid Triangle");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3){
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
