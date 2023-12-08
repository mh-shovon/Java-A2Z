package Practice.JavaOOP.Tutorial121;

public class VariablelengthArguments {
    void addNumbers(int ... num){
        int sum = 0;
        for (int i : num) {
            sum = sum + i;           
        }
        System.out.println("The sum is: " + sum + "\n" );
    }
    
}
