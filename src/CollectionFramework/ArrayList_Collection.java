package CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Collection {

    public static void main(String[] args) {


        ArrayList Array1 = new ArrayList();

        Array1.add("Tabu");
        Array1.add("Golu");
        Array1.add("Aniket");
        Array1.add("Nitin");
        Array1.add("Deepak");

        System.out.println(Array1);

        Array1.remove("Aniket");
        System.out.println(Array1);


        Array1.remove(3);
        System.out.println(Array1);

        System.out.println(Array1.contains("Golu"));
        System.out.println(Array1.size());

        String s1 = (String) Array1.get(2);
        System.out.println(s1);

        Array1.removeAll(Array1);
        System.out.println(Array1);












    }
}
