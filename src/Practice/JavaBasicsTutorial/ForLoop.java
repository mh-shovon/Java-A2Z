package Practice.JavaBasicsTutorial;
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop--->");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Print i: " + i);
        }
        System.out.println("\n");
        for (int j = 1; j <= 10; j = j + 2) {
            System.out.println("Print j: " + j);
        }

        System.out.println("Nested For Loop--->");
        // Outer loop
        for (int x = 1; x <= 2; x++) {
            System.out.println("Outer Loop Count: " + x);

            for (int y = 1; y <= 5; y++) {
                System.out.println("Inner Loop Count: " + y);
            }
        }
        System.out.println("\n");
        System.out.println("\n"+"For Each Loop--->");
        String [] cars = {"BMW", "Hyundai", "Range Rover", "Lander"};
        for (String i : cars) {
            System.out.println("Print the cars name: "+i);
        }

    }
}
