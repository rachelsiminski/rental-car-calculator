package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        gatherCustomerInfo();
        //displaySelections();
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
        String tollTagChoice = scanner.nextLine();

        // Read gps selection
        System.out.println("Would you like to include a gps ($2.95/day fee) (y/n): ");
        String gpsChoice = scanner.nextLine();

        // Read roadside assistance selection
        System.out.println("Would you like to include roadside assistance ($3.95/day fee) (y/n): ");
        String roadsideAssistChoice = scanner.nextLine();

        System.out.println(customerName);

        formatCustomerInfo(customerName, customerAge, pickupDate, numberOfDays, tollTagChoice, gpsChoice, roadsideAssistChoice);
    }

    // formatCustomerInfo(): Take user data from gatherCustomerInfo() and format for display
    public static void formatCustomerInfo(String name, int age, String date, short days, String tag, String gps, String assist) {
        boolean isUnderage = age < 25;  // Change to underage
        boolean isTollTag = tag.equals("y");
        boolean isGps = gps.equals("y");
        boolean isAssist = assist.equals("y");
        double packagePrice = 29.99;

        System.out.println("Hello " + name);
        System.out.println("Pickup date: " + date + " -- " + days + " day rental.");

        if (isUnderage) {   // Change to account for underage instead of over age
            double underageSurcharge = (packagePrice * days) * .3;  // Add 30% surcharge for under 25 (Fix calculation)
            packagePrice += underageSurcharge;
            System.out.printf("Underage surcharge: $%.2f\n", underageSurcharge);
        }
        if (isTollTag) {
            double perDiemToll = days * 3.95;
            packagePrice += perDiemToll;
            System.out.printf("Toll tag total: $%.2f\n", perDiemToll);
        }
        if (isGps) {
            double perDiemGps = days * 2.95;
            packagePrice += perDiemGps;
            System.out.printf("GPS total: $%.2f\n", perDiemGps);
        }
        if (isAssist) {
            double perDiemAssist = days * 3.95;
            packagePrice += perDiemAssist;
            System.out.printf("Roadside assistance total: $%.2f\n", perDiemAssist);
        }

        System.out.printf("Total cost: $%.2f", packagePrice);
    }
}
