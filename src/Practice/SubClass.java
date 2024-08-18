package Practice;

public class SubClass extends SuperExample{

    int speed = 180;
  void display()
  {
      System.out.println("Maximum speed="+ super.speed);

      System.out.println("Maximum speed="+ this.speed);
  }
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        System.out.println(s1.speed);
         s1.display();
    }
}
