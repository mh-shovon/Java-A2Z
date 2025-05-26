package ProblemSolving.JavaProblemsForQa;

import java.util.Scanner;

public class P01_CheckPalindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = userInput.nextInt();

        int reverseNumber = 0;
        int temp = number;

        while(temp != 0){
            int digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp = temp / 10;
        }

        if(number == reverseNumber){
            System.out.println("The entered number is a palindrome");
        } else {
            System.out.println("The entered number is not a palindrome");
        }
    }
}
