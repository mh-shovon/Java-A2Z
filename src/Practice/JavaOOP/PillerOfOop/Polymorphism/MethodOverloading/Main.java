package Practice.JavaOOP.PillerOfOop.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(15, 20));
        System.out.println(calculator.add(5.50, 4.50));
        System.out.println(calculator.add(5, 5, 5));
    }
}
