package Array29July2024;

import java.util.Scanner;

public class LeftTraingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] ArraySize = new int[n];


        for (int i=ArraySize.length ;i>0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
