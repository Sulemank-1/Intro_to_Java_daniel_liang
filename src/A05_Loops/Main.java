package A05_Loops;

public class Main {
    public static void main(String[] args) {

        String remainder = "" + 100 % 2;
        System.out.println(remainder);
        double quotient = 25.0 / 2.0;

        remainder = "" + quotient % 2;
        System.out.println(remainder);
        quotient /= 2;

    }

}
