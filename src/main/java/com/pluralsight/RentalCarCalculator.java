package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        gatherCustomerInfo();

    }

    // gatherCustomerInfo(): Collect customer info and package choices
    public static void gatherCustomerInfo() {
        Scanner scanner = new Scanner(System.in);

        // Read customer name
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();

        // Read customer age
        System.out.println("Enter your age: ");
        int customerAge = scanner.nextInt();
        // Consume newline
        scanner.nextLine();

        if (customerAge < 25) {
            System.out.println("30% Underage Surcharge applies");
        }

        // Read pickup date
        System.out.println("Enter the pick up date (MM/DD): ");
        String pickupDate = scanner.nextLine();

        // Read number of days renting
        System.out.println("How many days are you booking: ");
        short numberOfDays = scanner.nextShort();
        // Consume newline
        scanner.nextLine();

        // Read toll tag selection
        System.out.println("Would you like to include a toll tag ($3.95/day fee) (y/n): ");
        String tollTagChoice = scanner.nextLine();  // I want to do a char, but no input option?

        // Read gps selection
        System.out.println("Would you like to include a gps ($2.95/day fee) (y/n): ");
        String gpsChoice = scanner.nextLine();

        // Read roadside assistance selection
        System.out.println("Would you like to include roadside assistance ($3.95/day fee) (y/n): ");
        String roadsideAssistChoice = scanner.nextLine();

        System.out.println(customerName);
    }
}
