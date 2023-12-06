package Practice.JavaOOP.Tutorial2;

public class TecherClass2 {
        String teacherName;
        String teacherGender;
        String teacherAddress;
        int teacherPhone;

        void printTeacherInfo(){// Method create for print info and use it in test class for print this.
            System.out.println("Name: " + teacherName);
            System.out.println("Gender: " + teacherGender);
            System.out.println("Address: " + teacherAddress);
            System.out.println("Phone: " + teacherPhone);
            System.out.println("\n");
        }
}
