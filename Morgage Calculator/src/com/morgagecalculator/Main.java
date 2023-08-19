package com.morgagecalculator;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percentage = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period(Years): ");
        byte period = scanner.nextByte();

        double monthlyInterestRate = annualInterestRate/monthsInYear/percentage;
        double morgage = principal*(monthlyInterestRate*(Math.pow(monthlyInterestRate+1,period*monthsInYear))/(Math.pow(monthlyInterestRate+1,period*monthsInYear)-1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(morgage);
        System.out.println("Mortgage: "+ mortgageFormatted);
    }
}
