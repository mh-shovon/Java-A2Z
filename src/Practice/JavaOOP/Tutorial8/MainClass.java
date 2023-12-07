package Practice.JavaOOP.Tutorial8;
//difference between constructor and method
public class MainClass {
    public static void main(String[] args) {
        TestClass8 objStudent1 = new TestClass8();
        objStudent1.printStudentInfo();

        TestClass8 objStudent2 = new TestClass8("Mehedi", 101010);
        objStudent2.printStudentInfo();

        TestClass8 objStudent3 = new TestClass8("Hasan Shovon", "Male", 202020);
        objStudent3.printStudentInfo();
    }
}