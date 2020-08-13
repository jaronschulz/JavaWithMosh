package com.jzs;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int loan = (int)scanner.nextDouble();
        System.out.println(
                loan
        );

        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();
        double monthlyRate = (interestRate/100/12);

        System.out.print("Periode (Years): ");
        int years = scanner.nextInt();
        int payments = years / 12;

        double mortgage;
        mortgage = loan * (monthlyRate * Math.pow((1 + monthlyRate), payments)) / (monthlyRate * Math.pow((1 + monthlyRate), payments))-1;

        String costs = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + costs);
    }
}
