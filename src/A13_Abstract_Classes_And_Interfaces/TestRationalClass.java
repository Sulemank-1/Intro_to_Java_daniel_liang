package A13_Abstract_Classes_And_Interfaces;

public class TestRationalClass {
    static void main() {
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " − " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
