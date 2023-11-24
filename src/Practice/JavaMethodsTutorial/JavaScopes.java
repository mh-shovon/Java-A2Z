package Practice.JavaMethodsTutorial;

public class JavaScopes {
    //Instance Scope Variable-->
    int y = 20;

    //Class Scope or Static scope-->
    static int z;
    public static void main(String[] args) {
        
    }
    //Local Scope--->
    public void localScopeMethod1() {
        int x = 10; // x has local scope
        System.out.println(x); // valid
    }

    public void localScopeMethod2() {
        // System.out.println(x); // Error: x cannot be accessed here
    }

    //Instance Scope--->
    public void instanceScopeMethod1(){
        System.out.println(y);
    }
    public void instanceScopeMethod2(){
        System.out.println(y);
    }

    //Class scope or Static scope
    public void staticScopeMethod1() {
        z = 30; // valid
        System.out.println(z); // valid
    }

    public void staticScopeMethod2() {
        System.out.println(z); // valid
    }
}
