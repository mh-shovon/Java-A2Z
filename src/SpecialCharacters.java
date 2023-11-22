import java.net.Socket;

public class SpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Java Special Characters--->");
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println("Print with double quotation: "+txt1);

        String txt2 = "We are the so-called \'Vikings\' from the north.";
        System.out.println("Print with single quotation: "+txt2);

        String txt3 = "The character \\ is called backslash.";
        System.out.println("Print with a backslash: "+txt3);
    }
}
