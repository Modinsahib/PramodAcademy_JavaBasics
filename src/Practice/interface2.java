package Practice;

public class interface2  implements interface1{

   public void run()
    {
        System.out.println("Run under interface2");
    }

    public static void main(String[] args) {
        interface2 f3 = new interface2();
        f3.run();
    }

}
