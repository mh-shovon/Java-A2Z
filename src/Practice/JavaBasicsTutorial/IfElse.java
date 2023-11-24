package Practice.JavaBasicsTutorial;
public class IfElse {
    public static void main(String[] args) {
        System.out.println("If Else Statement--->");
        int A = 20;
        int B = 10;
        if (A > B) {
            System.out.println("A is grater than B.");
        } else {
            System.out.println("A is smaller than b");
        }

        System.out.println("Else If Statement--->");
        int time = 17;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        System.out.println("Short Hand If...Else (Ternary Operator)--->");
        int time1 = 20;
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
