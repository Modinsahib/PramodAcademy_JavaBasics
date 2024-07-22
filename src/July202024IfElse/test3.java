package July202024IfElse;

public class test3 {

    public static void main(String[] args) {
        if (false) { // condition false no code execute
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}
