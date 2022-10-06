package codehs.unit_1._6;

import java.util.Scanner;

public class Exercise_1_6_8 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        final double x0 = inputScanner.nextDouble();
        System.out.println("Rating rounded: " + (int)(x0 + 0.5));
    }
}
