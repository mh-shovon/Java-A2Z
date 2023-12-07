package Practice.JavaOOP.Tutorial9.Part1_23;
//Static Keyword
public class StaticVariableMethodBlockClass {
    String studentName;
    int id;
    static String universityName = "BUBT"; //Static variable
    static int count = 0;//Static variable

    static String Address = "Mirpur, Dhaka";

    StaticVariableMethodBlockClass(String name, int roll){
        studentName = name;
        id = roll;
        count++;
    }
    void printStudentInfo(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + id);
        System.out.println("Student University: " + universityName);
        System.out.println("\n");
    }

    void printStudentCount(){
        System.out.println("Total Student:" + count + "\n");
    }
}
