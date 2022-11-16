package codehs.unit_5._7;

public class Exercise_5_7_5 {
    public static class Randomizer {
        public static int nextInt() {
            return nextInt(1, 10);
        }

        public static int nextInt(final int min, final int max) {
            return (int)(Math.random() * ((max - min) + 1) + min);
        }
    }
}
