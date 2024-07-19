package July142024;

public class PrefixPostfixOperators {
    public static void main(String[] args) {
        int a = 10;
      int result = a++; // result =10 a=11
      System.out.println(a); //a=11
      System.out.println(result); // result 10
//
//        // Exp = 10 , a = 11?
        System.out.println("***********");

        int a1 = 10;
        int result1 = ++a1; //result=11
        System.out.println(a1); //a=11
        System.out.println(result1); //result=11

        System.out.println("***********");
        int r = 10;
        System.out.println(r++ + r); // 10 + 11

        System.out.println("***********");
        int g = 10;
        System.out.println(g++ + ++g);  //10+12
        System.out.println(g); //12






    }
}
