package Practice.JavaOOP.Tutorial9.Part5_RestrictStaticMethod;

public class RestrictStaticMethodClass {
    void display1(){
        display2();
        System.out.println("I am non static method.");
    }

    static void display2(){
        System.out.println("I am static method.");
    }

    // Static member er moddhe kokhono non static der use kora jabe na. but non static er moddhe static der use kora jabe.
}
