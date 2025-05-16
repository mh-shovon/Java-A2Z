package Practice.JavaMethodsTutorial;

public class JavaMethodOverloading {
    public static void main(String[] args) {
        //Without Overloading a method we can declare two method in this way.
        System.out.println("Without Overloading--->");
        int sum1 = addTwoIntegerNumber(5, 5);
        double sum2 = addTwoDoubleNumber(5.5, 4.6);
        System.out.println("Integer Sum: " + sum1);
        System.out.println("Double Sum: " + sum2);

        //With overloading, we can do this by following the bellow thing--->
        System.out.println("\n"+"With Overloading--->");
        int sum3 = addTwoNumber(5, 5);
        double sum4 = addTwoNumber(5.5, 4.6);
        System.out.println("Integer Sum: " + sum3);
        System.out.println("Double Sum: " + sum4);

        

    }

    //Without Overloading a method we can declare two method in this way.
    static int addTwoIntegerNumber(int a, int b){
        return a + b;
    }

    //Without Overloading a method we can declare two method in this way.
    static double addTwoDoubleNumber(double a, double b){ 
        return a + b;
    }

    //With overloading, we can do this by following the bellow thing--->
    static int addTwoNumber(int num1, int num2){
        return num1 + num2;
    }

    static double addTwoNumber(double num3, double num4){
        return num3 + num4;
    }
}
