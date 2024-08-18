package Practice;

public class Overriding1 extends Papa {

@Override
    void papa1()
    {
        System.out.println(" I am Beta");
    }

    public static void main(String[] args) {
        Overriding1 r1 = new Overriding1();
        r1.papa1();
    }

}
