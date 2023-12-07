package ProblemSolving.Area_Calculation;

public class Triangle_Circle {
    void triangleCalculation(float base, float height){
        float triangleArea = (base *height)/2;
        System.out.println("Triangle Area is: " + triangleArea);
    }

    void circleCalculation(double r){
        double circleArea = (r * r * Math.PI);
        System.out.println("Triangle Area is: " + circleArea);
    }
}
