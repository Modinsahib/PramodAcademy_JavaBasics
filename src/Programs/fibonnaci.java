package Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class fibonnaci {

    public static void main(String[] args) {
        System.out.println("Enter number till you want fibonnaci series -");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int r=0;
       ;
        for (int i=0;i<n;i++)
        {
            System.out.print(r+" ");
            r=f+s;

            f=s;
            s=r;



        }
    }
}
