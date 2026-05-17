package A13_Abstract_Classes_And_Interfaces.Exercises;
import java.util.Date;

public class Exercise13_05 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(10,20);

        System.out.println("Larger circle is \n" + Circle.max(c1, c2));
        System.out.println("Larger rectangle is \n" + Rectangle.max(c1, c2));
    }
}

abstract class GeometricObjectt implements Comparable<GeometricObjectt> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObjectt(){
        dateCreated = new Date();
    }

    protected GeometricObjectt(String color, boolean filled){
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
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObjectt o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObjectt max(GeometricObjectt o1, GeometricObjectt o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

}


class Circle extends GeometricObjectt {
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Circle)
            return radius == ((Circle)o).radius;
        else
            return false;
    }
}


class Rectangle extends GeometricObjectt {
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}



