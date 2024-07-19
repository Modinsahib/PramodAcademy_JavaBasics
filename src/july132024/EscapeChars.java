package july132024;

public class EscapeChars {
    public static void main(String[] args) {
        //Escape chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word
     System.out.println("Pramod" + c3 + "Dutta"); // first word deleted
   System.out.println("Pramod" + c2 + "Dutta"); // backlash one char deleted
      System.out.println("Pramod" + c1 + "Dutta"); // one tab added
      System.out.println("Pramody" + c + "Dutta"); // added to next line
    }
}
