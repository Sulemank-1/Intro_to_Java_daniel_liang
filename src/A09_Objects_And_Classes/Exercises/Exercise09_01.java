package A09_Objects_And_Classes.Exercises;


public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.println("Width: " + rec1.width);
        System.out.println("Height: " + rec1.height);
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());

        System.out.println("Width: " + rec2.width);
        System.out.println("Height: " + rec2.height);
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
    }
}

class Rectangle{
    double width;
    double height;

    Rectangle(){
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }
}
