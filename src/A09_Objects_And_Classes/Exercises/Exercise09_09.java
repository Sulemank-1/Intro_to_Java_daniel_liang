package A09_Objects_And_Classes.Exercises;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter() + " area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter() + " area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter() + " area: " + polygon3.getArea());
    }
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0.0;
        y = 0.0;
    }

    public RegularPolygon(int newN, double newSide){
        n = newN;
        side = newSide;
        x = 0.0;
        y = 0.0;
    }

    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setN(int newN){
        n = newN;
    }

    public void setSide(double newSide){
        side = newSide;
    }

    public void setX(double newX){
        x = newX;
    }

    public void setY(double newY){
        y = newY;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }


}
