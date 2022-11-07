package codehs.unit_5._9;

public class Exercise_5_9_7 {
    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

        /**
         * Returns value of numerator
         * @return numerator
         */
        public int getNumerator() {
            return numerator;
        }

        /**
         * Sets new value of numerator
         * @param numerator new numerator value
         */
        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        /**
         * Returns value of denominator
         * @return denominator
         */
        public int getDenominator() {
            return denominator;
        }

        /**
         * Sets new value of denominator
         * @param denominator new denominator
         */
        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        /**
         * Updates this fraction by adding another fraction
         * @param other Fraction to add to existing fraction
         */

        //Calculate by using the FractionMath class, then update
        //the numerator and denominator from the returned Fraction
        public void addFraction(Fraction other){
            final Fraction result = FractionMath.add(this, other);
            setNumerator(result.getNumerator());
            setDenominator(result.getDenominator());
        }

        /**
         * Updates this fraction by multiplying another fraction
         * @param other Fraction to multiple to existing fraction
         */

        //Calculate by using the FractionMath class, then update
        //the numerator and denominator from the returned Fraction
        public void multiplyFraction(Fraction other){
            final Fraction result = FractionMath.multiply(this, other);
            setNumerator(result.getNumerator());
            setDenominator(result.getDenominator());
        }

        /**
         * Prints fraction as numerator / denominator
         * Example: 1 / 2
         */

        public String toString(){
            return String.format("%d / %d", numerator, denominator);
        }
    }

    public static class FractionMath {

        /*
         * This is a static class that the Fraction class will use.
         * No updates are needed.
         */

        public static Fraction add(Fraction frac1, Fraction frac2){
            final int numerator = frac1.getNumerator() * frac2.getDenominator() +
                    frac2.getNumerator() * frac1.getDenominator();

            final int denominator = frac1.getDenominator() * frac2.getDenominator();

            return new Fraction(numerator, denominator);
        }

        public static Fraction multiply(Fraction frac1, Fraction frac2){
            final int numerator = frac1.getNumerator() * frac2.getNumerator();
            final int denominator = frac1.getDenominator() * frac2.getDenominator();

            return new Fraction(numerator, denominator);
        }
    }

    public static void main(final String[] args) {
        final Fraction first = new Fraction(3, 4);
        final Fraction half = new Fraction(1, 2);

        System.out.println(first);
        System.out.print("Multiplying: ");
        System.out.println(half);

        first.multiplyFraction(half);

        System.out.println("Answer: " + first);

        System.out.println();
        System.out.print("Adding: ");
        System.out.println(half);

        first.addFraction(half);

        System.out.println("Answer: " + first);
    }
}
