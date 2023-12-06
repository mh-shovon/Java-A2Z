package Practice.JavaOOP.Tutorial6;

public class TeacherClass6 {//Constructor Overloading
    String teacherName;
    String teacherGender;
    String teacherAddress;
    int teacherPhone;
    int teacherAge;
    
    TeacherClass6(String name, String gender, String address, int phone, int age){// Constructor
        teacherName = name;
        teacherGender = gender;
        teacherAddress = address;
        teacherPhone = phone;
        teacherAge = age;
    }

    TeacherClass6(String name, int age){
        teacherName = name;
        teacherAge = age;
    }
    TeacherClass6(){ 
        System.out.println("No Information");
    }

    void printTeacherInfo(){
        System.out.println("Name: " + teacherName);
        System.out.println("Gender: " + teacherGender);
        System.out.println("Address: " + teacherAddress);
        System.out.println("Phone: " + teacherPhone);
        System.out.println("Age: " + teacherAge);
        System.out.println("\n");
    }
}
