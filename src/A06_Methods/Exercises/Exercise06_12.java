package A06_Methods.Exercises;

public class Exercise06_12 {
    public static void main(String[] args) {
        char ch1 = '1';
        char ch2 = 'Z';
        int lines = 12;
        printChars(ch1,ch2,lines);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;
        for (char i = ch1; i<= ch2; i++){
            System.out.print(i + " ");
            count++;
            if (count % numberPerLine == 0)
                System.out.println();
        }
    }
}
