package ProblemSolving.JavaProblemsForQa;

import java.util.Scanner;

public class P03_MissingNumbersInArray {
    public static void main(String[] args) {
        int [] myNumbers = {1, 2, 3, 5, 6};
        int lengthOfMyNumbers = myNumbers.length+1;
        System.out.println("Length of the array is : " + lengthOfMyNumbers);

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter a number to check : ");
//        int numberToCheck = userInput.nextInt();
        int numberToCheck = -1;


        for(int i = 0; i <lengthOfMyNumbers; i++){
            boolean found = false;
            for(int j = 0; j<myNumbers.length - 1; j++){
                if (myNumbers[j] == i){
                    found = true;
                    System.out.println("Number found");
                    break;
                }
            }
            if(!found){
                numberToCheck = i;
                break;
            }
        }
        if (numberToCheck != -1) {
            System.out.println("Missing number is: " + numberToCheck);
        } else {
            System.out.println("No number is missing.");
        }
    }
}
