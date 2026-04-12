package A10_Object_Oriented_Thinking;


public class Main {
    public static void main(String[] args) {

        char[] charArray = {'G', 'o', 'o', 'd', 'D', 'a', 'y'};
        String message = new String(charArray);
        System.out.println(message);

        System.out.println("_____________________________________");

        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));

        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i] + " ");
        }

        System.out.println();

        System.out.println("_____________________________________");


        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));

        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));


        System.out.println("_____________________________________");

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s);

        System.out.println("_____________________________________");

        String[] tokenss = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokenss.length; i++) {
            System.out.print(tokenss[i] + " ");
        }

        System.out.println();

        System.out.println("_____________________________________");

        char[] chars = "Java".toCharArray();
        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        String strr = String.valueOf(new char[]{'J', 'a', 'v', 'a'});

        System.out.println(str);
        System.out.println(strr);

        System.out.println("_____________________________________");

        String strrr = String.valueOf(5.44);
        System.out.println(strrr);

        System.out.println("_____________________________________");

        String ss = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println(ss);

        System.out.println("_____________________________________");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        stringBuilder.insert(11, "HTML and ");
        stringBuilder.delete(8,11);
        stringBuilder.deleteCharAt(8);
        stringBuilder.reverse();
        stringBuilder.replace(11, 15, "HTML");
        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);

    }
}
