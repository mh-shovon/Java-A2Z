package Practice.JavaOOP.Tutorial3;

public class TestClass3 {
    public static void main(String[] args) {
        TeacherClass3 objectTeacher1 = new TeacherClass3();
        objectTeacher1.setTeacherInfo("Mr Hasib", "Male", "Dhaka", 1900000000);
        objectTeacher1.printTeacherInfo();

        TeacherClass3 objectTeacher2 = new TeacherClass3();
        objectTeacher2.setTeacherInfo("Mrs Sharmin", "Female", "Dhaka", 1900000000);
        objectTeacher2.printTeacherInfo();
    }
}
