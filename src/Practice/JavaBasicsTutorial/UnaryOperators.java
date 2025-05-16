package Practice.JavaBasicsTutorial;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = -5;
        int result;
        System.out.println("Unary Plus = +a :: ");
        result = +x;
        System.out.println(result);

        System.out.println("Unary Minus = -a :: ");
        result = -x;
        System.out.println(result);

        int y1 = 10;
        int y2;
        System.out.println("Post Increment Operator = a++ :: ");
        y2 = y1++; //post increment
        System.out.println(y2);
        y2 = y1;
        System.out.println(y2);

        System.out.println("Pre Increment Operator = ++a :: ");
        y2 = y1;
        System.out.println(y2);
        y2 = ++y1; //pre increment
        System.out.println(y2);

        int z1 = 20;
        int z2;
        System.out.println("Post Decrement Operator = a-- :: ");
        z2 = z1--; //post decrement
        System.out.println(z2);
        z2 = z1;
        System.out.println(z2);

        System.out.println("Pre Decrement Operator = --a :: ");
        z2 = z1;
        System.out.println(z2);
        z2 = --z1; //pre decrement
        System.out.println(z2);
    }
}
