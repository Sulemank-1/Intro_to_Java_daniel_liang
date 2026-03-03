package A09_Objects_And_Classes.Exercises;

import java.util.Scanner;

public class Exercise09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e =  (y1 - y2) * x1 - (x1 - x2) * y1;
        double f =  (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation1 equation = new LinearEquation1(a, b, c, d, e, f);

        if (equation.isSolvable())
            System.out.println("x is " + equation.getX() + " y is " + equation.getY());
        else
            System.out.println("The two lines are parallel");

    }

}

class LinearEquation1 {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation1(double newA, double newB, double newC, double newD, double newE, double newF){
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getD(){
        return d;
    }

    public double getE(){
        return e;
    }

    public double getF(){
        return f;
    }

    public boolean isSolvable(){
        return (a*d - b*c) != 0;
    }

    public double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }

    public double getY(){
        return (a*f - e*c) / (a*d - b*c);
    }
}

