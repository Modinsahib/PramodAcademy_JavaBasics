package CollectionFramework;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List marks = new ArrayList();

        marks.add(30);
        marks.add(90);
        marks.add(80);
        marks.add(40);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Comparator.reverseOrder());

        System.out.println(marks);







    }
}
