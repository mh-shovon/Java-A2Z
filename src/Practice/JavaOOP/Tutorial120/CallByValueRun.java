package Practice.JavaOOP.Tutorial120;

public class CallByValueRun {
    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        int  x = 10; //primitive data -- esob data stack e store hoy.
        System.out.println("Value of x before call: " + x);

        obj.change(x);
        System.out.println("Value of x after call: " + x);
    }
}
