package Practice.JavaOOP.Tutorial5;

public class TeacherClass5 {
    String teacherName;
    String teacherGender;
    String teacherAddress;
    int teacherPhone;
    
    TeacherClass5(String name, String gender, String address, int phone){// Constructor
        teacherName = name;
        teacherGender = gender;
        teacherAddress = address;
        teacherPhone = phone;
    }

    TeacherClass5(){ 
        System.out.println("No Value");
    }

    void printTeacherInfo(){
        System.out.println("Name: " + teacherName);
        System.out.println("Gender: " + teacherGender);
        System.out.println("Address: " + teacherAddress);
        System.out.println("Phone: " + teacherPhone);
        System.out.println("\n");
    }
}
