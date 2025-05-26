package ProblemSolving.JavaProblemsForQa;

import java.util.Scanner;

public class P02_ReverseAnInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = userInput.nextInt();

        int reverseNumber = 0;

        while(number != 0){
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse Number is : " + reverseNumber);
    }
}
