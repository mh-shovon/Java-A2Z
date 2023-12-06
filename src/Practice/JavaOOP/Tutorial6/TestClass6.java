package Practice.JavaOOP.Tutorial6;

public class TestClass6 { //Constructor Overloading
    public static void main(String[] args) {
        TeacherClass6 objectTeacher1 = new TeacherClass6("MD Hamid", "Male", "Dhaka", 1900000000, 55);
        objectTeacher1.printTeacherInfo();

        TeacherClass6 objectTeacher2 = new TeacherClass6("MD Hamid", "Male", "Dhaka", 1900000000, 60);
        objectTeacher2.printTeacherInfo();

        TeacherClass6 objectTeacher3 = new TeacherClass6();
        objectTeacher3.printTeacherInfo();

        TeacherClass6 objectTeacher4 = new TeacherClass6("Shovon", 45);
        objectTeacher4.printTeacherInfo();
    }
}
