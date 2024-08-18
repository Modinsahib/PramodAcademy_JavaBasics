package Constructor04082024;

public class ConstEx1 {
    public static void main(String[] args) {

        Ex1 x1 = new Ex1(); //DC


        Ex1 x2 = new Ex1("Maddy",24); //Parameterised

        System.out.println(x2.name);
        System.out.println(x2.age);

        Ex1 x3 = new Ex1("Mithesh");

        System.out.println(x3.name);

    }
}
