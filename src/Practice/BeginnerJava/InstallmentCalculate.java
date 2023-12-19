package Practice.BeginnerJava;

import java.util.Scanner;

public class InstallmentCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phonePrice;
        int numberOfInstallment;
        double installmentAmountPerMonth;

        System.out.println("Enter Mobile Price: ");
        phonePrice = sc.nextInt();

        System.out.println("Number of installment: ");
        numberOfInstallment = sc.nextInt();

        installmentAmountPerMonth = (double)phonePrice / numberOfInstallment;

        System.out.println("Installment amount per month is: " + installmentAmountPerMonth);

        sc.close();

    }
}
