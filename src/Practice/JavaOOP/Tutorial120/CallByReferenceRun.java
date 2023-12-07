package Practice.JavaOOP.Tutorial120;

public class CallByReferenceRun {
    public static void main(String[] args) {
        CallByReference obj1 = new CallByReference();
        obj1.name = "Mehedi";
        System.out.println("Before Call: "+ obj1.name);

        obj1.change(obj1);
        System.out.println("After Call: " + obj1.name);
    }
}
