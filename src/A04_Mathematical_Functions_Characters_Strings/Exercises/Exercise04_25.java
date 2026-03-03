package A04_Mathematical_Functions_Characters_Strings.Exercises;

public class Exercise04_25 {
    public static void main(String[] args) {

    }

    public static void generatePlateNumbers(){

        char l1 = (char)('a' + (int)(Math.random() * 26));
        char l2 = (char)('a' + (int)(Math.random() * 26));
        char l3 = (char)('a' + (int)(Math.random() * 26));

        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int n3 = (int)(Math.random() * 10);
        int n4 = (int)(Math.random() * 10);

        System.out.printf("%c%c%c%d%d%d%d", Character.toUpperCase(l1), Character.toUpperCase(l2),
                Character.toUpperCase(l3)
                , n1, n2, n3, n4 );

    }

}
