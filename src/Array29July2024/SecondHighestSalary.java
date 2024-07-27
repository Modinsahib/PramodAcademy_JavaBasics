package Array29July2024;

import java.util.Scanner;

public class SecondHighestSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] ArraySize = new int[n];

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter all "+n+ " elements =");

        for(int i=0;i<n;i++)
        {
            ArraySize[i] = sc.nextInt();
        }


        System.out.println("Array elements are =");

        //Display array
        // for(int i=0;i<n;i++)
        //{
          //  System.out.println(ArraySize[i]);
        //}

        int temp=ArraySize[0];

        for(int i=0;i<ArraySize.length; i++)
        {
            if (ArraySize[i] > temp)
            {
               temp = ArraySize[i];
            }

        }
        System.out.println("Highest salary is ="+temp);

   int HighestSalary =temp;

            temp=0;

        for(int i=0;i<ArraySize.length; i++)
        {


            if (ArraySize[i] > temp && ArraySize[i] < HighestSalary )
            {
                temp = ArraySize[i];
            }

        }
        System.out.println("Second Highest salary is ="+temp);














    }
}
