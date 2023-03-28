package codehs.unit_10._1;

import java.util.Scanner;

public class Exercise_10_1_6 {
    @SuppressWarnings("InnerClassMayBeStatic")
    public class Factorial {
        public static void main(String[] args) {
            final Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int number = input.nextInt();

            System.out.println(calcFactorial(number));
        }

        public static int calcFactorial(int x) {
            // Write a base case
            if (x == 0)
                return 1;
            else
                // Call the simplified solution
                return x * calcFactorial(x - 1);
        }
    }
}
