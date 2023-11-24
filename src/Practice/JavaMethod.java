package Practice;

public class JavaMethod {
    public static void main(String[] args) {
        sumOfTwoNumbers();
        sumOfTwoNumbers(); // Called multiple times
        sumOfTwoNumbers(); // Called multiple times
    }

    static void sumOfTwoNumbers() {
        int num1 = 256;
        int num2 = 320;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
