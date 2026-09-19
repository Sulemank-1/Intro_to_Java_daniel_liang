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
        this(3, 1, 0.0, 0.0);
    }

    public RegularPolygon(int n, double side){
        this(n, side, 0.0, 0.0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
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

    public void setN(int n){
        this.n = n;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }


}
