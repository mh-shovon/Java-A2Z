package Practice.JavaOOP.Tutorial3;

public class TestClass3 {
    public static void main(String[] args) {
        TeacherClass3 objectTeacher1 = new TeacherClass3();
        objectTeacher1.setTeacherInfo("Mr Hasib", "Male", 35, "Dhaka", "01789789789");
        objectTeacher1.printTeacherInfo();

        TeacherClass3 objectTeacher2 = new TeacherClass3();
        objectTeacher2.setTeacherInfo("Mrs Sharmin", "Female", 32, "Sylhet", "01900000000");
        objectTeacher2.printTeacherInfo();
    }
}
