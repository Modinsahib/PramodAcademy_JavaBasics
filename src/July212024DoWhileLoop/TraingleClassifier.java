package July212024DoWhileLoop;


import java.util.Scanner;

public class TraingleClassifier {

    public static void main(String[] args) {

        System.out.println("Enter 1st side of triangle");
        Scanner sc1 = new Scanner(System.in);
        int a=sc1.nextInt();

        System.out.println("Enter 2nd side of triangle");
        Scanner sc2= new Scanner(System.in);
        int b=sc2.nextInt();


        System.out.println("Enter 3rd side of triangle");
        Scanner sc3= new Scanner(System.in);
        int c=sc3.nextInt();

        if((a==b)&& (b==c)&& (c==a))
            System.out.println("All sides are equal triangle is Equilateral");
        else if ((a==b) && (b!=c) ||(b==c) && (c!=a) || (c==a) && (a!=b))
        {
            System.out.println("Two sides are equal given triangle is Isosceles");
        }
        else
            System.out.println("No sides are equal for given traingle");

    }
}
