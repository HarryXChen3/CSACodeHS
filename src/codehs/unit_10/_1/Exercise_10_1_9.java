package codehs.unit_10._1;

import java.util.Scanner;

public class Exercise_10_1_9 {
    @SuppressWarnings("InnerClassMayBeStatic")
    public class Bacteria {
        public static void main(String[] args) {
            final Scanner input = new Scanner(System.in);

            System.out.println("How many hours will the bacteria breed? ");
            int hours = input.nextInt();
            int bacteria = colonySize(hours);
            System.out.println("After " + hours + " hours, there will be " + bacteria);
        }

        public static int colonySize(int hour) {
            // Write a base case
            if (hour == 0) {
                return 7;
            } else {
                // Write a recursive call
                return colonySize(hour - 1) * 5;
            }
        }

    }
}
