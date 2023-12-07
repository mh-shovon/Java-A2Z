package Practice.JavaOOP.Tutorial119;

public class DebugDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println("Print the value of i: " + i);
            System.out.println("Step wise sum" + sum + "\n");
        }
        System.out.println("\n" + "Sum is: " + sum);
    }
}
