package Programs;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();

        System.out.println("Enter number " + n + " is");

        if (n < 1)
            System.out.println("It's not prime number");
        else if (n == 1) {
            System.out.println("is prime");
        }
        else {
            int flag=0;
            for (int i = 2; i < n; i++) {

                if (n % i ==0)
                {
                    flag=1;

                }

            }

            if(flag==1)

            {
                System.out.println("not prime");

            }
            else {
                System.out.println("prime");
            }







        }
    }
}