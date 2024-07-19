package july132024;

public class BODMASrule {
    public static void main(String[] args) {
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println(b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.
    }
}
