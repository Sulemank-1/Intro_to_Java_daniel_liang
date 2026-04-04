package A12_Exception_Handling_And_Text_IO;

public class TestCircleWithException {
    static void main() {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }

        System.out.print("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}
