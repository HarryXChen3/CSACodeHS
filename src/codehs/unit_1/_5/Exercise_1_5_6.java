package codehs.unit_1._5;

import java.util.Scanner;

public class Exercise_1_5_6 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the cost of the t-shirt: ");
        int cost = inputScanner.nextInt();
        cost++;
        cost--;
        System.out.println("The t-shirt costs $" + cost);
        System.out.println("A personalized t-shirt costs $" + (cost + 1));
        System.out.println("Without personalization, the t-shirt costs $" + cost);
    }
}
