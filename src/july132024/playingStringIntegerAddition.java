package july132024;

public class playingStringIntegerAddition {
    public static void main(String[] args) {

             int a = 10;
       int b= 34;
       System.out.println(a+b);

        String s1 = "PRamod";
        String s2 = "Dutta";
        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;

      System.out.println(x+y+s3); // if start with integer then addition perform else treat as string
       System.out.println(s3+x+y);
       System.out.println(x+s3+y);


        System.out.println(x+y+s3+y+s3+x+y);
    }
}
