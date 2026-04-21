package A13_Abstract_Classes_And_Interfaces.Exercises;

import java.util.Date;
import java.util.Scanner;

public class Exercise13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter color: ");
        String color = input.next();

        System.out.print("Enter if the triangle is filled: ");
        boolean isFilled = input.nextBoolean();

        GeometricObject triangle = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println(triangle);

    }
}

class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
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

    @Override
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + super.toString();
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
