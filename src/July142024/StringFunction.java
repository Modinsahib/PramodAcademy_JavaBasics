package July142024;

import java.sql.SQLOutput;

public class StringFunction {
    public static void main(String[] args) {
        String name = "Modin";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase()); //modin
        System.out.println(name.length()); //5
        System.out.println(name.toUpperCase()); //MODIN
        System.out.println(name.charAt(2)); //d
        System.out.println(name.charAt(0)); //M
        //System.out.println(name.charAt(10)); // Exception Index 10 out of bounds

        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4= str1.concat(str2); // Hello Guys

        System.out.println(str4);

    }
}
