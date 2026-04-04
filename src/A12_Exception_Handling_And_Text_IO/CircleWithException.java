package A12_Exception_Handling_And_Text_IO;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException(){
        this(1.0);
    }

    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException{
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
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
