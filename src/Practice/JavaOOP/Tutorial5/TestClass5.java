package Practice.JavaOOP.Tutorial5;

public class TestClass5 {
    public static void main(String[] args) {
        TeacherClass5 objectTeacher1 = new TeacherClass5("MD Hamid", "Male", "Dhaka", 1900000000);
        objectTeacher1.printTeacherInfo();

        TeacherClass5 objectTeacher2 = new TeacherClass5("MD Hamid", "Male", "Dhaka", 1900000000);
        objectTeacher2.printTeacherInfo();

        TeacherClass5 objectTeacher3 = new TeacherClass5();
        objectTeacher3.printTeacherInfo();
    }
}
