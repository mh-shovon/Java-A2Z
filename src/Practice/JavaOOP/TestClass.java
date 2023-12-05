package Practice.JavaOOP;

public class TestClass {
    public static void main(String[] args) {
        TeacherClass objectTeacher1 = new TeacherClass();
        objectTeacher1.teacherName = "Md. Ashraful Islam";
        objectTeacher1.teacherGender = "Male"; 
        objectTeacher1.teacherAddress = "Dhaka";
        objectTeacher1.teacherPhone = 1700000000;
        objectTeacher1.printTeacherInfo();

        TeacherClass objectTeacher2 = new TeacherClass();
        objectTeacher2.teacherName = "Sudipto Chaki";
        objectTeacher2.teacherGender = "Male"; 
        objectTeacher2.teacherAddress = "Dhaka";
        objectTeacher2.teacherPhone = 1800000000;
        objectTeacher2.printTeacherInfo();

    }
}
