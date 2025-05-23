package NextGenJavaByKamrul.Day_01;

public class Day_1_Array {
    public static void main(String[] args) {
        int [] age = {20, 25, 30, 55, 29};
        System.out.println(age[3]);

        String [] cars = {"volvo", "hero", "bmw", "audi", "range rover"};
        System.out.println(cars[2]);
        cars[4] = "honda";
        System.out.println(cars[4]);

        int lengthOfAge = age.length;
        System.out.println(lengthOfAge);

        int lengthOfCars = cars.length;
        System.out.println(lengthOfCars);

        //Loop Through an Array
        for(int i = 0; i < cars.length; i+=1){
            System.out.println("Types of available cars: " + cars[i]);
        }

        for(int i : age){ //Enhanced for loop
            System.out.println(i);
        }

        //Real Life example-1
        int[] marks = {75, 80, 85, 95, 88, 92};
        float averageMarks, totalMarks = 0;
        int lengthOfMarks = marks.length;

        for(int i = 0; i < lengthOfMarks; i+=1){
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("Total mark is : " + totalMarks);

        averageMarks = totalMarks / lengthOfMarks;
        System.out.println("Average mark is: " + averageMarks);

        //Real Life example-2
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 12};
        int lowestAge = ages[0];
        for(int i =
            0; i <ages.length; i+=1){
            if(lowestAge > ages[i]){
                lowestAge = ages[i];
            }
         }
        System.out.println("The lowest age in the array is: " + lowestAge);

        //Multi-dimensional array

        int [][] myNumbers = { {0, 1, 2, 3} , {0, 1, 2} };
        System.out.println("Value is : " + myNumbers[0][3]);
        myNumbers [1][2] = 3; //change the value of an element
        System.out.println("Value is : " + myNumbers[1][2]);

        int [][] myNumbers1 = { {0, 1, 2, 3} , {4, 5, 6} };
        System.out.println("Length is  : " + myNumbers1.length);
        for(int i = 0; i < myNumbers1.length; i+=1){
            for(int j = 0; j < myNumbers1[i].length; j+=1){
                System.out.println("Values of my numbers are:" + myNumbers1[i][j]);
            }
        }
    }
}
