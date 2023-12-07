package Practice.JavaOOP.Tutorial114;

public class BoxProblemClass {
    double height;
    double width;
    double depth;

    BoxProblemClass(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void displayVol(){
        double vol = height * width * depth;
        System.out.println("The volume is: " + vol);
    }
}
