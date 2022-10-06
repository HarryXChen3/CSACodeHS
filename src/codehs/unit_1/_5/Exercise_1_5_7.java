package codehs.unit_1._5;

import java.util.Scanner;

public class Exercise_1_5_7 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("How much does dinner usually cost?");
        final double normDinner = inputScanner.nextDouble();

        System.out.println("How much is laser tag for one person?");
        final double normLaser = inputScanner.nextDouble();

        System.out.println("How much does a triple scoop cost?");
        final double normScoop = inputScanner.nextDouble();

        System.out.println("Dinner: $" + (normDinner * 3));
        System.out.println("Laser Tag: $" + (normLaser * 2));
        System.out.println("Ice-cream: $" + (normScoop * (4d/3)));
        System.out.println("Grand Total: $" + ((normDinner * 3) + (normLaser * 2) + (normScoop * (4d/3))));
    }
}
