package Practice.JavaOOP.Tutorial9.Part1_23;
//Static Keyword
public class MainClass {
    public static void main(String[] args) {
        StaticVariableMethodBlockClass objStudent1 = new StaticVariableMethodBlockClass("Mehedi", 101);
        objStudent1.printStudentInfo();
        objStudent1.printStudentCount();

        StaticVariableMethodBlockClass objStudent2 = new StaticVariableMethodBlockClass("Hasan", 102);
        objStudent2.printStudentInfo();
        objStudent2.printStudentCount();

        StaticVariableMethodBlockClass objStudent3 = new StaticVariableMethodBlockClass("Shovon", 103);
        objStudent3.printStudentInfo();
        objStudent3.printStudentCount();

        StaticVariableMethodBlockClass objStudent4 = new StaticVariableMethodBlockClass("Hriddu", 104);
        objStudent4.printStudentInfo();
        objStudent4.printStudentCount();

        StaticVariableMethodBlockClass objStudent5 = new StaticVariableMethodBlockClass("Mohua", 105);
        objStudent5.printStudentInfo();
        objStudent5.printStudentCount();

        System.out.println("University Address: " + StaticVariableMethodBlockClass.Address);//Static variable use
    }
}
