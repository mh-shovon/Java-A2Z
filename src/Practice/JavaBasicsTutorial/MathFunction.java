package Practice.JavaBasicsTutorial;
public class MathFunction {
    public static void main(String[] args) {
        System.out.println("Find a Max Number--->");
        int num1 = 9;
        int num2 =15;
        double num3 = 3.79;
        System.out.println("Max number is: "+Math.max(num1, num2));

        System.out.println("Min number is: "+Math.min(num1, num2));

        System.out.println("SQRT of num1 is: "+(Math.sqrt(num1)));
        System.out.println("SQRT of num1 is: "+(int)(Math.sqrt(num1)));

        System.out.println("Absolute of num3 is: "+Math.abs(num3));
 
        System.out.println("Random Number is: "+Math.random());
        int randomNum = (int)(Math.random()*101);
        System.out.println("The random number is: "+randomNum);
    }
}
