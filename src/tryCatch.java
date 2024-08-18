public class tryCatch {
    public static void main(String[] args) {


        int a = 10;
        try {
            int c = a / 0;
            System.out.println("Value of C=" + c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("catch executed");
        }
        finally {
            System.out.println("I will execute always");
        }
    }
}