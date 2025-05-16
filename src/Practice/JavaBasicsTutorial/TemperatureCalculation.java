package Practice.JavaBasicsTutorial;

import java.util.Scanner;

public class TemperatureCalculation {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Enter the temperature in celsius scale: ");
        celsius = userInput.nextDouble();
        fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("Temperature in fahrenheit is : " + fahrenheit);

        System.out.println("Enter the temperature in fahrenheit scale: ");
        fahrenheit = userInput.nextDouble();
        celsius = (5.0/9.0) * (fahrenheit-32);
        System.out.println("Temperature in fahrenheit is : " + celsius);
    }
}
