package Programs;

public class swapNumber {
    public static void main(String[] args) {

        int a=5;
        int b=10;

        System.out.println("Before swap a= "+a+" b= "+b);

        a=a+b; //15
        b=a-b; //-5
        a=a-b; // 10


        System.out.println("After swap a= "+a+" b= "+b);
    }
}
