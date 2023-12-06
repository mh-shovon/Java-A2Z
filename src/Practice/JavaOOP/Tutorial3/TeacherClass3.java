package Practice.JavaOOP.Tutorial3;

public class TeacherClass3 {
    String teacherName;
        String teacherGender;
        String teacherAddress;
        int teacherPhone;

        void setTeacherInfo(String name, String gender, String address, int phone){// Parameterised Method create and use
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
