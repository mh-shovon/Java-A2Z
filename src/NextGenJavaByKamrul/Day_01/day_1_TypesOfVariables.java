package NextGenJavaByKamrul.Day_01;

public class day_1_TypesOfVariables {
    // Instance variable
    String color;

    // Static variable
    static int wheels = 4;

    public void showDetails() {
        // Local variable
        int speed = 120;
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}
