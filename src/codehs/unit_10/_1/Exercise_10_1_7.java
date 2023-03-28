package codehs.unit_10._1;

import java.util.Scanner;

public class Exercise_10_1_7 {
    @SuppressWarnings("InnerClassMayBeStatic")
    public class Countdown {
        public static void main(String[] args) {
            // Start here
            final Scanner scanner = new Scanner(System.in);
            System.out.println("Enter starting number: ");
            final int inputN = scanner.nextInt();
            final String output = countdown(inputN, new StringBuilder());
            System.out.println(output);
        }

        public static String countdown(int number, final StringBuilder builder) {
            // Base case - return Blastoff!
            if (number <= 0) {
                builder.append("Blastoff!");
                return builder.toString();
            } else {
                builder.append(number).append(" ");
                // Recursive call
                return countdown(number - 2, builder);
            }
        }
    }
}
