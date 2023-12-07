package Practice.JavaOOP.Tutorial118;

public class AutoTypeConversionRun {
    public static void main(String[] args) {
        AutoTypeConversionClass ob1 = new AutoTypeConversionClass();
        ob1.add();
        ob1.add(50, 50);
        ob1.add(50, 50, 50);
        ob1.add(12.50, 12.50);
        ob1.add(12.50, 12.50, 12.50);
        ob1.add(5.f, 10, 7.f, 10);
    }
}