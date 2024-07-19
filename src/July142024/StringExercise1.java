package July142024;

import java.sql.SQLOutput;

public class StringExercise1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);//33

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB ->char ASCII value
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);

//**********************************
        short s = 10;
        char d = 'A'; //65
        int ss = s+d; //10+65
        System.out.println(ss);

        System.out.println("***********************");
        int r1 = 87;
        long r2 = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+r1+r2);  //KKVV8791
        System.out.println(s1+s2+(a+b));   //KKVV33
        //System.out.println(KK+vv+87+91);
    }
}
