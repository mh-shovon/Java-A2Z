package Practice.JavaMethodsTutorial;

public class JavaRecursion {
    public static void main(String[] args) {
        int result1 = sum1(10);
        System.out.println("The sum is: " + result1);

        //Halting Condition----->
        int result2 = sum2(11, 20);
        System.out.println("The result fot the halting condition is: " +result2);
    }

    public static int sum1(int num) {
        if (num > 0) {
            return num + sum1(num - 1);
        } else {
            return 0;
        }
    }

    // Halting Condition----->
    public static int sum2(int start, int end){
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }
}
