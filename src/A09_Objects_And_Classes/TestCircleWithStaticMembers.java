package A09_Objects_And_Classes;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + Circle.getNumberOfObjects());

        Circle c1 = new Circle();  

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.getRadius() + ") and number of Circle objects (" + Circle.getNumberOfObjects() + ")");

        Circle c2 = new Circle(5);

        c1.setRadius(9);

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.getRadius() + ") and number of Circle objects (" + Circle.getNumberOfObjects() + ")");
        System.out.println("c2: radius (" + c2.getRadius() + ") and number of Circle objects (" + Circle.getNumberOfObjects() + ")");
    }
}
