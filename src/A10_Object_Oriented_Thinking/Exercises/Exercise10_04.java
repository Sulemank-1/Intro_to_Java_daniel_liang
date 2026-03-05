package A10_Object_Oriented_Thinking.Exercises;

public class Exercise10_04 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(MyPoint.distance(p1, p2));
    }
}

class MyPoint{
    private double x;
    private double y;

    public MyPoint(){
        this(0,0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point){
        return distance(point.x, point.y);
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2){
        return p1.distance(p2.x, p2.y);
    }
}
