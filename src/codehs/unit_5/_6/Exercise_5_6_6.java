package codehs.unit_5._6;

import java.util.Scanner;

public class Exercise_5_6_6 {
    public static class Food {
        private String name;
        private int calories;

        public Food(final String name, final int calories) {
            this.name = name;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public int getCalories() {
            return calories;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("%s have %d calories", name, calories);
        }
    }

    public static void main(final String[] args) {
        final Food hamburger = new Food("Hamburger", 600);
        final Food frenchFries = new Food("French Fries", 350);
        final Food coke = new Food("Coke", 200);

        final Scanner inputScanner = new Scanner(System.in);
        System.out.println(hamburger + "\nHow many would you like?");
        final int n_hamburger = inputScanner.nextInt();

        System.out.println(frenchFries + "\nHow many would you like?");
        final int n_frenchFries = inputScanner.nextInt();

        System.out.println(coke + "\nHow many would you like?");
        final int n_coke = inputScanner.nextInt();

        System.out.println(
                "Your meal will have a total of " +
                (
                        hamburger.getCalories() * n_hamburger
                        + frenchFries.getCalories() * n_frenchFries
                        + coke.getCalories() * n_coke
                ) + " calories"
        );
    }
}
