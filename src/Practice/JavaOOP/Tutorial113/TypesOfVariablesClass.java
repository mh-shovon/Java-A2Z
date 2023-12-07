package Practice.JavaOOP.Tutorial113;

public class TypesOfVariablesClass {
    String studentName;//instance variable-- kono class er moddhe thakbe but kono method er baire.
    int studentRoll;//instance variable-- kono class er moddhe thakbe but kono method er baire.
    static String studentAddress = "Mirpur";

    TypesOfVariablesClass(String name, int id ){
        // the variable name and id only used in this section as local variable.
        studentName = name;
        studentRoll = id;
    } 

    void displayInfo(){
        System.out.println(studentName);
        System.out.println(studentRoll);
        System.out.println(studentAddress);
    }
}
