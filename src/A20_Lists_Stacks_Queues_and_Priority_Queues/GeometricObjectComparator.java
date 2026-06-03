package A20_Lists_Stacks_Queues_and_Priority_Queues;
import A13_Abstract_Classes_And_Interfaces.GeometricObject;

import java.io.Serializable;
import java.util.*;

public class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable {
        @Override
        public int compare(GeometricObject o1, GeometricObject o2) {
            double area1 = o1.getArea();
            double area2 = o2.getArea();

            if (area1 < area2)
                return -1;
            else if (area1 == area2)
                return 0;
            else
                return 1;
        }
}
