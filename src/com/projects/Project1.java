package com.projects;

import java.util.Scanner;

public class Project1 {
    private static final double USD_TO_INR = 83.43;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("1. INR (Indian Rupee)");

        System.out.println("Enter Dollars to Convert");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter Amount");
        double amount = scanner.nextDouble();

        System.out.println("Enter the currency you want to convert to ");
        String toCurrency = scanner.next().toUpperCase();

        double result = convertCurrency(amount, fromCurrency, toCurrency);
        System.out.println(amount + " " + fromCurrency + " equals " + result + " " + toCurrency);
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double rate;
        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "USD":
                        rate = 1;
                        break;
                    case "INR":
                        rate = USD_TO_INR;
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
                }
                break;
            case "INR":
                switch (toCurrency) {
                    case "USD":
                        rate = 1 / USD_TO_INR; // Inverse conversion
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
                }
                break;
            default:
                throw new IllegalArgumentException("Unsupported currency: " + fromCurrency);
        }
        return amount * rate;
    }
}

