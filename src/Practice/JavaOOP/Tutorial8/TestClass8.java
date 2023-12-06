package Practice.JavaOOP.Tutorial8;
//difference between constructor and method
public class TestClass8 {
    String name, gender;
    int id;

    TestClass8(){
        System.out.println("No Data available.");
    }

    TestClass8(String studentName, int studentId){
        name = studentName;
        id = studentId;
    }

    TestClass8(String studentName,String studentGender, int studentId){
        name = studentName;
        gender = studentGender;
        id = studentId;
    }

    void printStudentInfo(){
        System.out.println("Student Name: "+ name);
        System.out.println("Student Gender: "+ gender);
        System.out.println("Student Id: "+ id);
        System.out.println("\n");
    }
}
