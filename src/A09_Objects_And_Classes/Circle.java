package A09_Objects_And_Classes;

public class Circle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }

    private double radius;
    private static int numberOfObjects = 0;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }


}
