package Practice.JavaOOP.Tutorial115;

public class InstanceVariableHidingRun {
    public static void main(String[] args) {
        InstanceVariableHidingClass firstBox = new InstanceVariableHidingClass(10, 10, 10);
        firstBox.displayVol();

        InstanceVariableHidingClass secondBox = new InstanceVariableHidingClass(20, 30, 10);
        secondBox.displayVol();
    }
}
