package July212024DoWhileLoop;

public class FnoReturn {
    public static void main(String[] args) {
        getdata(); // No return function
     String s= returnValueFunction(); // function with return value

        String s1= returnValueFunction2("Maa"); // function with parameter  return value
        System.out.println("With Parameter="+s1);

        display("Dada"); // function with parameter no return value

    }

    static void getdata()
    {
        System.out.println("getdata");
    }

    static String returnValueFunction()
    {
        System.out.println("return function");
        return "Modin";
    }

    static String returnValueFunction2(String a)
    {
        System.out.println("return function with parameter");
        return "Abba";
    }

    static void display(String b)
    {
        System.out.println("With no return"+b);
    }
}


