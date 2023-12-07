package Practice.JavaOOP.Tutorial9.Part5_RestrictStaticMethod;

public class RestrictStaticMethodRun {
    public static void main(String[] args) {
        RestrictStaticMethodClass obj1 = new RestrictStaticMethodClass();
        obj1.display1();

        RestrictStaticMethodClass.display2();
    }
}
