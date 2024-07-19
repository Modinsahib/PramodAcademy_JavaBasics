package july132024;

import jdk.jfr.internal.tool.Main;

public class FinalUse {
    public static void main(String[] args) {
        final  int a=100;
       //  a=200; // cannot assign value to final variable, will throw error
        System.out.println(a);

        //check enum
        int Enum = 45; // small enum is not allowed as it s keyword
        System.out.println(Enum);
    }
}
