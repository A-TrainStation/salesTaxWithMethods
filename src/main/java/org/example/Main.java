package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double purchasePrice = inputPurchasePrice();
        double stateTaxRate = 0.04;   // 4%
        double countyTaxRate = 0.02;  // 2%

        double stateTax = calculateTax(purchasePrice, stateTaxRate);
        double countyTax = calculateTax(purchasePrice, countyTaxRate);

        double totalSalesTax = calculateTotal(stateTax, countyTax);
        double totalSale = calculateTotal(purchasePrice, totalSalesTax);

        displayTotals(purchasePrice, stateTax, countyTax, totalSalesTax, totalSale);
    }

    public static double inputPurchasePrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase price: $");
        return scanner.nextDouble();
    }

    public static double calculateTax(double price, double taxRate) {
        return price * taxRate;
    }


    public static double calculateTotal(double price1, double price2) {
        return price1 + price2;
    }

    public static void displayTotals(double purchasePrice, double stateTax, double countyTax, double totalSalesTax, double totalSale) {
        System.out.println("\n--- Sales Tax Calculation ---");
        System.out.printf("Purchase Price: $%.2f%n", purchasePrice);
        System.out.printf("State Tax (4%%): $%.2f%n", stateTax);
        System.out.printf("County Tax (2%%): $%.2f%n", countyTax);
        System.out.printf("Total Sales Tax: $%.2f%n", totalSalesTax);
        System.out.printf("Total Sale: $%.2f%n", totalSale);
    }
}
