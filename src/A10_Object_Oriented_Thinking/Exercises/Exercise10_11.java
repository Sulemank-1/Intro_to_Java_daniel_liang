package A10_Object_Oriented_Thinking.Exercises;

public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D circle = new Circle2D(2, 2, 5.5);

        System.out.print("Area: " + circle.getArea());
        System.out.print("Perimeter: " + circle.getPerimeter());

        System.out.println("\n" + circle.contains(3,3));
        System.out.println(circle.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(circle.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D{
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y){
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) < radius * radius;
    }

    public boolean contains(Circle2D circle){
        double distance = circle.distance(this.x, this.y);
        return distance + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle){
        double distance = circle.distance(this.x, this.y);
        return distance < circle.radius + this.radius;
    }

    private double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

}
