package Practice;

public class Overloading1 {

    void add()
    {
        System.out.println("without parameter");
    }

    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Overloading1 l = new Overloading1();
        l.add();
        l.add(2,3);


    }
}
