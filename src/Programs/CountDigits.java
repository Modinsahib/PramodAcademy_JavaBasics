package Programs;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); //1234
         int t=0;
        int i;
         for(i=1; n>10;i++)
         {
             n=n/10;
         }

        System.out.println("Total number of digits="+i);

    }
}
