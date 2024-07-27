package Array29July2024;

import java.util.Scanner;

public class RightTraingle {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] ArraySize = new int[n];

        for (int i=0;i<ArraySize.length;i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
