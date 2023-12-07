package Practice.JavaOOP.Tutorial114;

public class BoxProblemRun {
    public static void main(String[] args) {
        BoxProblemClass firstBox = new BoxProblemClass(10, 10, 10);
        firstBox.displayVol();

        BoxProblemClass secondBox = new BoxProblemClass(20, 30, 10);
        secondBox.displayVol();
    }
}
