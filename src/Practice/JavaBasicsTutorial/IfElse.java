package Practice.JavaBasicsTutorial;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("If Else Statement--->");
        int A = 20;
        int B = 10;
        if (A > B) {
            System.out.println("A is grater than B.");
        } else {
            System.out.println("A is smaller than b");
        }

        System.out.println("Else If Statement--->");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Not eligible for voting.");
        } else if (age == 18) {
            System.out.println("Eligible for voting. Just turned 18!");
        } else {
            System.out.println("Eligible for voting.");
        }

        System.out.println("Short Hand If...Else (Ternary Operator)--->");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int userAge = userInput.nextInt();
        String result = (userAge > 18) ? "Eligible for voting." : "Not eligible for voting.";
        System.out.println(result);
    }
}
