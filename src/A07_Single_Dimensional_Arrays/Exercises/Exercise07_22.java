package A07_Single_Dimensional_Arrays.Exercises;

public class Exercise07_22 {
    public static void main(String[] args) {
        int count = 0;


        for (int i = 0; i < args.length; i++) {
            String currentWord = args[i];

            for (int j = 0; j < currentWord.length(); j++) {
                char character = currentWord.charAt(j);
                if (Character.isUpperCase(character)) {
                    count++;
                }
            }
        }

        System.out.println("Total uppercase letters: " + count);
    }
}
