package A30_Aggregate_Operations_For_Collection_Streams;

import java.util.*;
import java.util.stream.*;

public class CountLettersUsingStream {
    private static int count = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Object[] chars =
                random.ints(100, (int)'a', (int)'z' + 1)
                .mapToObj(e -> (char)e)
                .toArray();

        System.out.println("The lower case letters are:");
        Stream.of(chars)
                .forEach(e -> {
                    System.out.print(e + (++count % 20 == 0 ? "\n" : " "));
                });

        count = 0;
        System.out.println("\nThe occurrences of each letter are:");
        Stream.of(chars)
                .collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
                .forEach((k,v) -> {
                    System.out.print(v + " " + k + (++count % 10 == 0 ? "\n" : " "));
                });
    }
}
