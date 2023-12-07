package Practice.JavaOOP.Tutorial117;

public class MethodOverloadingClass {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(){
        System.out.println("Nothing to add.");
    }
}
