package ProblemSolving.BeeProlems;

import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int A = myScanner.nextInt();
        int B = myScanner.nextInt();
        myScanner.close();
        int X = A + B;
        System.out.println("X =\n" + X);
    }
}
