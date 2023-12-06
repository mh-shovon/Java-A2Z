package Practice.JavaOOP.Tutorial2;

public class TestClass2 {
    public static void main(String[] args) {
        TecherClass2 objectTeacher1 = new TecherClass2();
        objectTeacher1.teacherName = "Md. Ashraful Islam";
        objectTeacher1.teacherGender = "Male"; 
        objectTeacher1.teacherAddress = "Dhaka";
        objectTeacher1.teacherPhone = 1700000000;
        objectTeacher1.printTeacherInfo();

        TecherClass2 objectTeacher2 = new TecherClass2();
        objectTeacher2.teacherName = "Md. Mahabubul Islam";
        objectTeacher2.teacherGender = "Male"; 
        objectTeacher2.teacherAddress = "Dhaka";
        objectTeacher2.teacherPhone = 1800000000;
        objectTeacher2.printTeacherInfo();
    }
}
