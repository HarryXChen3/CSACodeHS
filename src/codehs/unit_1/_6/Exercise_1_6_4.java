package codehs.unit_1._6;

import java.util.Scanner;

public class Exercise_1_6_4 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a double:");
        final double orig = inputScanner.nextDouble();
        System.out.println(orig);
        System.out.println((int)orig);
        System.out.println(orig + 0.5);
        System.out.println((int)(orig + 0.5));
    }
}
