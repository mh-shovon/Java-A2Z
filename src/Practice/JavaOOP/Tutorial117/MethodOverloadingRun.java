package Practice.JavaOOP.Tutorial117;

public class MethodOverloadingRun {
    public static void main(String[] args) {
        MethodOverloadingClass ob1 = new MethodOverloadingClass();
        ob1.add();
        ob1.add(50, 50);
        ob1.add(50, 50, 50);
        ob1.add(12.50, 12.50);
        ob1.add(12.50, 12.50, 12.50);
    }
}