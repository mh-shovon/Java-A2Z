package NextGenJavaByKamrul.Day_01;

public class Day_1_NonPrimitiveVariables {
    public static void main(String[] args) {
        String greeting = "Hello Java";
        int[] scores = {90, 85, 70};

        Day_1_Person p = new Day_1_Person();

        System.out.println(greeting);
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        System.out.println("First score: " + scores[0]);
    }
}
