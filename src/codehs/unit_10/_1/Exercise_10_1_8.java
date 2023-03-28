package codehs.unit_10._1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_10_1_8 {
    @SuppressWarnings("InnerClassMayBeStatic")
    public class RecursiveMin {
        public static void main(String[] args)
        {
            final Scanner input = new Scanner(System.in);
            final ArrayList<Integer> numbers = new ArrayList<>();

            while (true){
                System.out.println("Please enter numbers. Enter -1 to quit: ");
                int number = input.nextInt();

                if (number == -1){
                    break;
                }
                else {
                    numbers.add(number);
                }
            }

            int minimum = findMinimum(numbers);
            System.out.println("Minimum: " + minimum);
        }

        public static int findMinimum(ArrayList<Integer> numbers)
        {

            // Base Case: What is the smallest ArrayList you can have?
            // What is the minimum value of that array?

            // Recursive call: How do you find the minimum of the rest of the ArrayList?
            //                 (Not including the last element)

            // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
            return Collections.min(numbers);
        }
    }
}
