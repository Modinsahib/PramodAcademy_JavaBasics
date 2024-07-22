package July202024IfElse;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        s= sc.next();
        System.out.println(s);

        switch (s)
        {
            case "Monday": // for case if can use number, string anything
                System.out.println("its Mon");
                break;

            case "Tuesday":
                System.out.println("its Tue");
                break;

            default:
                System.out.println("its not a day");
        }
    }
}
