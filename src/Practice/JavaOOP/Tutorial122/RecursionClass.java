package Practice.JavaOOP.Tutorial122;

public class RecursionClass {
    int factorial(int num){
        if(num ==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
