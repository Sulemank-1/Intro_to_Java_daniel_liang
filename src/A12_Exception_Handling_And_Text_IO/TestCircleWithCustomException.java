package A12_Exception_Handling_And_Text_IO;

public class TestCircleWithCustomException {
    static void main() {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }

        System.out.print("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException{
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
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
