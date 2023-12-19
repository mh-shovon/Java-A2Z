package Practice.BeginnerJava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);

         int id;
         System.out.println("The id of the student is: ");
         id = userInput.nextInt();

         String name;
         System.out.println("The name of the student is: ");
         name = userInput.next();

         System.out.println("Studen ID is: " + id);
         System.out.println("Studen Name is: " + name);

         userInput.close();

    }
}
