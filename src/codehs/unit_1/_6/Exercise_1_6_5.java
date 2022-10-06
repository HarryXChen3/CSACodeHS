package codehs.unit_1._6;

import java.util.Scanner;

public class Exercise_1_6_5 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("First Int:");
        final int x0 = inputScanner.nextInt();
        System.out.println("Second Int:");
        final int x1 = inputScanner.nextInt();
        System.out.println((double)x0 / x1);
    }
}
