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
            System.out.println("Elements of the array are: " + cars1[i]);
        }
        System.out.println("\n" + "For Each Loop Through an Array--->");
        String[] cars2 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String j : cars2) {
            System.out.println("Elements of the array are: " + j);
        }

        System.out.println("\n" + "Multidimensional Arrays--->");
        int[][] myNum1 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNum1[0][3]); // Access Eement of these index.
        System.out.println(myNum1[1][2]); // Access Eement of these index.

        System.out.println("\n" + "Change Values of an Element--->");
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        myNumbers[1][2] = 8;
        System.out.println(myNumbers[1][2]); // Outputs 8 instead of 7

        System.out.println("\n" + "Loop Through a Multi-Dimensional Array--->");
        int[][] myNumbers3 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println("Print the length of the array: "+myNumbers3.length);
        for (int i = 0; i < myNumbers3.length; ++i) {
            for (int j = 0; j < myNumbers3[i].length; ++j) {
                System.out.println(myNumbers3[i][j]);
            }
        }
    }
}
