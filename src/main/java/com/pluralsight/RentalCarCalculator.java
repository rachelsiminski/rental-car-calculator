package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        gatherCustomerInfo();

    }

    // gatherCustomerInfo(): Collect customer info and package choices
    public static void gatherCustomerInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();


        System.out.println(customerName);
    }
}
