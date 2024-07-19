package July142024;

public class StringExercise3 {
    public static void main(String[] args) {

        String password  = "Modin@123";
        String pass_u = password.toLowerCase(); //modin@123
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password); //reference check //false
        System.out.println(pass_u.equals(password)); // content check // true
        System.out.println(pass_u.equalsIgnoreCase(password)); //true
        //Pramod@123 =  pramod@123  = PRamod@123 = PraMod@123

        System.out.println(password.substring(0,3)); //mod
        System.out.println(password.indexOf('d')); //2
        System.out.println(password.length()); //9
    }
}
