package Practice.JavaOOP.Tutorial115;

public class InstanceVariableHidingClass {
    double height;
    double width;
    double depth;

    InstanceVariableHidingClass(double height, double width, double depth){
        // When we use instance and local variable as same name
        // then this known as instance variable hiding. To resolve
        // tis we use (this.variable).
        this.height = height; 
        this.width = width;
        this.depth = depth;
    }

    void displayVol(){
        double vol = height * width * depth;
        System.out.println("The volume is: " + vol);
    }
}
