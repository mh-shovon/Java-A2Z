package NextGenJavaByKamrul.Day_01;

public class Day_1_TypesOfVariables {
    String name; //instance variable
    int id;
    static String universityName = "BUBT";

    Day_1_TypesOfVariables(String n, int i){ //n and i are local variables and are accessible only within this method.
        name = n;
        id = i;
    }

    void displayInformation(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(universityName);
    }

    public static void main(String[] args) {
        Day_1_TypesOfVariables obj1 = new Day_1_TypesOfVariables("shovon", 101);
        obj1.displayInformation();
        Day_1_TypesOfVariables obj2 = new Day_1_TypesOfVariables("Potter", 102);
        obj2.displayInformation();

        System.out.println("University Name : " + Day_1_TypesOfVariables.universityName);
    }
}
