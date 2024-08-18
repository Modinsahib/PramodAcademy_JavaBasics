package Practice;

public class staticExample {

    static int n=5;
static  void display()
{
    int m=5;
    System.out.println("static");
    System.out.println(m);
}


    public static void main(String[] args) {
        n=9;
        System.out.println(n);
        staticExample.display();
    }
}
