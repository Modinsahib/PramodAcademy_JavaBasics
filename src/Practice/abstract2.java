package Practice;

public class abstract2 extends  abstract1{

    void walk()
    {
        System.out.println("walk");
    }

    @Override
    void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        abstract2 ab = new abstract2();
        ab.walk();
        ab.run();
        ab.display();

    }
}

