package Constructor04082024;

public class Ex1 {
    String name;
    int age;

    Ex1()
    {
        System.out.println("Object created");
    }


    Ex1(String name, int age)
    {
        this.name =name;
        this.age = age;
    }

    Ex1(String name)
    {
        this.name = name;

    }
}
