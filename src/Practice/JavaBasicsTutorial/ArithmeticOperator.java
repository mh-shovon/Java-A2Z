package Practice.JavaBasicsTutorial;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1, num2, Sum, Sub, Mul;
        double Div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number1: ");
        num1 = sc.nextInt();

        System.out.println("Enter Number2: ");
        num2 = sc.nextInt();

        Sum = num1 + num2;
        System.out.println("Sum is : " + Sum);

        Sub = num1 - num2;
        System.out.println("Sub is : " + Sub);

        Mul = num1 * num2;
        System.out.println("Mul is : " + Mul);

        Div = (double)num1 / num2;
        System.out.println("Div is : " + Div);

        sc.close();
    }
}
