package Practice.JavaOOP.Tutorial121;

public class VariablelengthArgumentsRun {
    public static void main(String[] args) {
        VariablelengthArguments obj = new VariablelengthArguments();
        obj.addNumbers(10);
        obj.addNumbers(10, 10);
        obj.addNumbers(10, 10, 10);
        obj.addNumbers(10, 10, 10, 10);
        obj.addNumbers(10, 10, 10, 10, 10);
    }
}
// different type er arguments pathanor jonno alada alada method
// na baniye same maethod er moddhe different length er argument
// pass korar jonno (int ... parameterName) use kora jay.