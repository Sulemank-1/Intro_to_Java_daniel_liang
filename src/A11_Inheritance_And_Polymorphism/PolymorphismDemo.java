package A11_Inheritance_And_Polymorphism;

public class PolymorphismDemo {
    static void main() {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    public static void displayObject(GeometricObject object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
