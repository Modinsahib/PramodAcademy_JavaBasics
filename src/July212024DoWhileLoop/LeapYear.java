package July212024DoWhileLoop;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year =");
        Scanner s1= new Scanner(System.in);

        int n= s1.nextInt();


        if(n%4==0)
        {
        if((n%4==0) && (n%100==0))
            System.out.println("Its not leap year");
        else
            System.out.println("Its leap year");
            
        }
        else if(n%400==0) {
            System.out.println("its leap year");
        }
            else {
            System.out.println("Its not a leap year");
        }

    }
}
