package Practice;
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

        int d = 10;
        d *= 5;
        System.out.println("Mul of d*5 and assign in d: " + d);

        int e = 10;
        e /= 5;
        System.out.println("Mul of e/5 and assign in e: " + e);

        int f = 10;
        f %= 3;
        System.out.println("Modulas of f%5 and assign in f: " + f);

        int g = 5;
        g &= 3;
        System.out.println(g);

        int h = 5;
        h |= 3;
        System.out.println(h);

        int i = 5;
        i ^= 3;
        System.out.println(i);

        int j = 5;
        j >>= 3;
        System.out.println(j);

        int k = 5;
        k <<= 3;
        System.out.println(k);

        System.out.println("Comparison Operators:--->");
        int m = 5;
        int n = 3;
        System.out.println(m == n); // returns false because 5 is not equal to 3

        int m1 = 5;
        int n1 = 3;
        System.out.println(m1 != n1); // returns true because 5 is not equal to 3

        int x1 = 5;
        int y1 = 3;
        System.out.println(x1 > y1); // returns true because 5 is greater than 3

        int x2 = 5;
        int y2 = 3;
        System.out.println(x2 < y2); // returns false because 5 is not less than 3

        int x3 = 5;
        int y3 = 3;
        System.out.println(x3 >= y3); // returns true because 5 is greater, or equal, to 3

        int x4 = 5;
        int y4 = 3;
        System.out.println(x4 <= y4); // returns false because 5 is neither less than or equal to 3

        System.out.println("Logical Operators:--->");
        int x5 = 5;
        System.out.println(x5 > 3 && x5 < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

        int x6 = 5;
        System.out.println(x6 > 3 || x6 < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

        int x7 = 5;
        System.out.println(!(x7 > 3 && x7 < 10)); // returns false because ! (not) is used to reverse the result

    }
}
