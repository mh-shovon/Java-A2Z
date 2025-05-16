package Practice.JavaOOP.Tutorial3;

public class TeacherClass3 {
    String teacherName;
    String teacherGender;
    int teacherAge;
    String teacherAddress;
    String teacherPhone;

    void setTeacherInfo(String name, String gender, int age, String address, String phone){// Parameterised Method create and use
        teacherName = name;
        teacherGender = gender;
        teacherAge = age;
        teacherAddress = address;
        teacherPhone = phone;
    }

    void printTeacherInfo(){
        System.out.println("Name: " + teacherName);
        System.out.println("Gender: " + teacherGender);
        System.out.println("Address: " + teacherAddress);
        System.out.println("Phone: " + teacherPhone);
        System.out.println("\n");
    }
}
