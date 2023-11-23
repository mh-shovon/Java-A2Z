package Practice;

public class JavaArrays {
    public static void main(String[] args) {
        System.out.println("Java Array--->");
        String[] cars = { "BMW", "Hyundai", "Range Rover", "Lander" };
        int[] myNum = { 10, 20, 30, 40, 50, 60 };
        System.out.println("\n" + "Access the Elements of an Array--->");
        System.out.println(cars[3]);
        System.out.println(myNum[5]);
        System.out.println("\n" + "Change an Array Element--->");
        cars[3] = "Ford";
        System.out.println(cars[3]);

        System.out.println("\n" + "Array Length--->");
        System.out.println("The length of the cars array is: " + cars.length);

        System.out.println("\n" + "For Loop Through an Array--->");
        String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars1.length; i++) {
            System.out.println("Elements of the array are: "+cars1[i]);
        }
        System.out.println("\n" + "For Each Loop Through an Array--->");
        String [] cars3 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String j : cars3) {
            System.out.println("Elements of the array are: "+j);           
        }


    }
}
