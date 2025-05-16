package Practice.JavaOOP.Tutorial1;

public class TestClass {
    public static void main(String[] args) {
        TeacherClass objectTeacher1 = new TeacherClass(); //declare and create an object
        objectTeacher1.teacherName = "Md. Ashraful Islam";
        objectTeacher1.teacherGender = "Male"; 
        objectTeacher1.teacherAddress = "Dhaka";
        objectTeacher1.teacherPhone = 1700000000;
        System.out.println("Name: " + objectTeacher1.teacherName);
        System.out.println("Gender: " + objectTeacher1.teacherGender);
        System.out.println("Address: " + objectTeacher1.teacherAddress);
        System.out.println("Phone: " + objectTeacher1.teacherPhone);
        System.out.println("\n");

        TeacherClass objectTeacher2 = new TeacherClass();
        objectTeacher2.teacherName = "Sudipto Chaki";
        objectTeacher2.teacherGender = "Male"; 
        objectTeacher2.teacherAddress = "Dhaka";
        objectTeacher2.teacherPhone = 1800000000;
        System.out.println("Name: " + objectTeacher2.teacherName);
        System.out.println("Gender: " + objectTeacher2.teacherGender);
        System.out.println("Address: " + objectTeacher2.teacherAddress);
        System.out.println("Phone: " + objectTeacher2.teacherPhone);
        System.out.println("\n");

    }
}
