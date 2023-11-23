package Practice;
public class JavaBooleans {
    public static void main(String[] args) {
        System.out.println("Booleans Values--->");
        boolean isJavaFan = true;
        boolean isLikeChicken = false;
        System.out.println(isJavaFan);
        System.out.println(isLikeChicken);

        System.out.println("Boolean Expression--->");
        int x = 10;
        int y = 5;
        System.out.println("The Result is: " + (x > y));
        System.out.println("The Result is: " + (y > x));
        System.out.println("The Result is: " + (60 > 50));
        System.out.println("The Result is: " + (x == y));

        int myAge = 27;
        int votingAge = 18;
        System.out.println("The result is: " + (myAge >= votingAge));
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
