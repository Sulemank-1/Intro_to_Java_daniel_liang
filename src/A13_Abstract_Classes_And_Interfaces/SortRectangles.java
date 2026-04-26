package A13_Abstract_Classes_And_Interfaces;

import java.util.Arrays;

public class SortRectangles {
    static void main() {
        ComparableRectangle[] rectangles = {new ComparableRectangle(3.4, 5.4), new ComparableRectangle(13.24, 55.4), new ComparableRectangle(7.4, 35.4), new ComparableRectangle(1.4, 25.4)};
        Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}