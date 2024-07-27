package Array29July2024;

public class StringBufferExample {
    public static void main(String[] args) {

// Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta
        System.out.println("Value of S1="+stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        System.out.println("Value of S1="+stringBuilder);
        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)

    }
}
