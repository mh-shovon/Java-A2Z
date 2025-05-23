package NextGenJavaByKamrul.Day_01;

public class day_1_NonPrimitiveVariables {
    public static void main(String[] args) {
        String greeting = "Hello Java";
        int[] scores = {90, 85, 70};

        day_1_Person p = new day_1_Person();

        System.out.println(greeting);
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        System.out.println("First score: " + scores[0]);
    }
}
