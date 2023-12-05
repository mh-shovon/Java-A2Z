package Practice.JavaOOP;

public class TeacherClass {
    String teacherName;
    String teacherGender;
    String teacherAddress;
    int teacherPhone;

    void printTeacherInfo(){ //Method Creation for printing
        System.out.println("Name: " + teacherName);
        System.out.println("Gender: " + teacherGender);
        System.out.println("Address: " + teacherAddress);
        System.out.println("Phone: " + teacherPhone);
        System.out.println("\n");
    }
}
