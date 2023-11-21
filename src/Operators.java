public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators:--->");
        int intNum1 = 20;
        int intNum2 = 10;
        int sum = intNum1 + intNum2;
        System.out.println("Sum is: "+sum+"\n");

        int sub = intNum1 - intNum2;
        System.out.println("Sub is: "+sub+"\n");

        int mul = intNum1 * intNum2;
        System.out.println("Mul is: "+mul+"\n");

        int div = intNum1 / intNum2;
        System.out.println("Div is: "+div+"\n");

        int modulus = intNum1 % intNum2;
        System.out.println("Modulas is: "+modulus+"\n");

        int x =1;
        x++;
        System.out.println("X is:"+x+"\n");

        int y =5;
        y--;
        System.out.println("Y is:"+y+"\n");

        System.out.println("Assignment Operators:--->");
        int a = 10;
        System.out.println("Assign value in a: "+a);

        int b = 10;
        b+=10;
        System.out.println("Sum of b+10 and assign in b: "+b);

        int c = 10;
        c-=5;
        System.out.println("Sub of c-5 and assign in b: "+c);

    }
}
