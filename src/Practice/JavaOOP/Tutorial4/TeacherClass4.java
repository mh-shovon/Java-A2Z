package Practice.JavaOOP.Tutorial4;

public class TeacherClass4 {
    String teacherName;
    String teacherGender;
    String teacherAddress;
    int teacherPhone;
    
    TeacherClass4(String name, String gender, String address, int phone){// Constructor
        teacherName = name;
        teacherGender = gender;
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
