package Array29July2024;

import java.sql.SQLOutput;

public class StringArray {
    public static void main(String[] args) {
        String s1 = new String("pramod"); // Heap AreaSSS
        String s2 = "modin"; // String constant pool
        System.out.println("String length ="+s2.length());
        System.out.println("String lowercase ="+s2.toLowerCase());
        System.out.println("String index="+s2.indexOf("o"));
        System.out.println("String chartAt="+s2.charAt(2));

    }
}
